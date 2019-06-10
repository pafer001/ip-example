package com.ip.dbip.importer;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;

import com.google.common.collect.Lists;
import com.ip.db.dao.IpDao;
import com.ip.db.entity.IpEntity;
import com.ip.db.mapper.IpEntityMapper;
import com.ip.dbip.domain.GeoAttributesImpl;
import com.ip.utils.SystemConfig;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;
import com.ip.dbip.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Singleton class responsible for loading the entire file into the JVM.
 *
 * @author Ankush Sharma
 */
@Slf4j
@Component
public  class ResourceImporter {

    @Autowired
    private IpDao ipDao;
    @Autowired
    private IpEntityMapper ipEntityMapper;

    private static final String COMMA_DELIMITER = ",";
    private static final Interner<String> interner = Interners.newWeakInterner();

//    static {
//
//        String path = SystemConfig.getProperty("db.ip.path");
//        File gzip = new File(path);
//        Assert.checkExpression(!gzip.exists(), "file " + gzip.getName() + " does not exist");
//
//                log.info("Loading file into repository ");
//                new ResourceImporter().load(gzip);
//                log.info("Loading finished");
//
//        }
//    }

    public void load() {
        String path = SystemConfig.getProperty("db.ip.path");
        File gzip = new File(path);
        load(gzip);
    }


    /**
     * Loads the file into JVM, reading line by line.
     * @param file The dbip-city-latest.csv.gz file as a File object.
     */
    public void load(final File file) {

        try {
            Assert.checkExpression(!Gzip.isGzipped(file), "Not a  gzip file");
        } catch (final IOException ex) {
            log.error("", ex);
        }

        List<IpEntity> ipEntities = Lists.newArrayList();
        try (val fis = new FileInputStream(file);
             val gis = new GZIPInputStream(fis);
             val decorator = new InputStreamReader(gis, StandardCharsets.UTF_8);
             val reader = new BufferedReader(decorator)) {
            log.debug("Reading dbip data from {}", file.getName());
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                i++;

                try {
                    IpEntity entity = null;
                    val array = parseRecord(line);
                    List<String> lines = CvsUtils.parse(line);
                    val geoAttributes = new GeoAttributesImpl
                            .Builder()
                            .withIpStart(lines.get(0))
                            .withIpEnd(lines.get(1))
                            .withContinent(lines.get(2))
                            .withCountry(lines.get(3))
                            .withProvince(lines.get(4))
                            .withCity(lines.get(5))
                            .withLatitude(lines.get(6))
                            .withLongitude(lines.get(7))
                            .build();
                    entity = geoAttributes.getGeoEntity();
                    if (entity != null) {
                        ipEntities.add(entity);
                    }
                    if (i % 1000 == 0) {
                        ipEntityMapper.insertList(ipEntities);
//                        ipDao.insert(geoAttributes.getGeoEntity());
                        ipEntities = Lists.newArrayList();
                        log.debug("Loaded {} entries", i);
                    }
                } catch (Exception e) {
                    log.error("line={}", line, e);

                }



            }
            ipEntityMapper.insertList(ipEntities);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String[] parseRecord(final String csvRecord) {
        Assert.notEmptyString(csvRecord, "null or empty csvRecord was passed");

        return Arrays
                .stream(csvRecord.split(COMMA_DELIMITER))
                .map(str -> normalize(str.replace("\"", "")))
                .toArray(String[]::new);
    }

    private static String normalize(final String str) {
        String result = str;
        if (Strings.requiresTrimming(str)) {
            result = str.trim();
        }
        return result;
    }


    public static void main(String[] args) {

        String[] strings = parseRecord("2c0f:f548::,2c0f:f548:ffff:ffff:ffff:ffff:ffff:ffff,AF,KE,\"Nairobi Area\",\"Nairobi (Kenyatta Hospital)\",-1.30109,36.817");
        System.out.println(strings);
    }

}
