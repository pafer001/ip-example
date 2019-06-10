package com.ip.dbip.utils;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CvsUtils {

    public static List<String> parse(String str) {

        String[] splitArray = str.split(",");
        if (splitArray.length == 8) {

            return Stream.of(splitArray).map((String s) ->
                    s.replaceAll("\"", "")).collect(Collectors.toList());
        }


        int quoStart = str.indexOf("\"");
        int quoEnd = str.indexOf("\"", quoStart +1);

        List<String> arrayList = Lists.newArrayList(str.substring(0, quoStart-1), str.substring(quoStart, quoEnd+1),
                str.substring(quoEnd+1));
        List<String> lines = Lists.newArrayList();

        for (String e : arrayList) {
            if (e.startsWith("\"") && e.endsWith("\"")) {
                lines.add(e.replaceAll("\"", ""));
                continue;
            }
            lines.addAll(Lists.newArrayList(e.split(",")));
        }

        return lines;
    }


    public static void main(String[] args) {

//        String line = "2a0e:9000::,2a0e:9000:ffff:ffff:ffff:ffff:ffff:ffff,EU,DE,\"North Rhine-Westphalia\",\"Cologne (Innenstadt, Cologne)\",50.9345,6.95391";
//
//        List<String> parse = parse(line);
//        System.out.println(parse);
//
//
//        String line = "0.0.0.0,0.255.255.255,ZZ,ZZ,,,0,0";
//        List<String> parse21 = parse(line);
//        System.out.println(parse21);

         String line = "5.8.26.0,5.8.27.255,AS,SG,,\"Singapore ,(Pioneer)\",1.32123,103.695";
        List<String> parse212 = parse(line);
        System.out.println(parse212);
    }


}
