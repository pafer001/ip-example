package com.ip.utils;

import in.ankushs.dbip.api.DbIpClient;
import in.ankushs.dbip.api.GeoEntity;

import java.io.File;

/**
 * @Author: wangzhenya
 * @Date: 19-5-10 下午8:25
 */
public class DbIpUtils {


    public static void main(String[] args) {


        final File gzipFile = new File("/home/pafer/Downloads/dbip-city-lite-2019-05.csv.gz");
        final DbIpClient client = new DbIpClient(gzipFile);
        final GeoEntity geoEntity = client.lookup("31.45.127.255");
        System.out.println(geoEntity);
    }
}
