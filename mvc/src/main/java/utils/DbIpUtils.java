package utils;//package com.ip.utils;
//
//
//import com.ip.dbip.api.DbIpClient;
//import com.ip.dbip.domain.GeoEntity;
//
//import java.io.File;
//
///**
// * @Author: wangzhenya
// * @Date: 19-5-10 下午8:25
// */
//public class DbIpUtils {
//
//
//    public static void main(String[] args) {
//
//
//        final File gzipFile = new File("/Users/wangzhenya/Downloads/dbip-city-lite-2019-05.csv.gz");
//        final DbIpClient client = new DbIpClient(gzipFile);
//        final String ipv6 = "2c0f:f468:ffff:ffff:ffff:ffff:ffff:ffff";
//
//        final GeoEntity geoEntity = client.lookup(ipv6);
//        System.out.println(geoEntity);
//    }
//}
