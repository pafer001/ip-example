package com.ip.utils;

import com.google.common.net.InetAddresses;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: wangzhenya
 * @Date: 19-4-20 下午1:36
 */
public class IpUtils {


    /**
     * 获取用户真实IP地址，不使用request.getRemoteAddr()的原因是有可能用户使用了代理软件方式避免真实IP地址,
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值
     *
     * @return ip
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        System.out.println("x-forwarded-for ip: " + ip);
        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
            if( ip.indexOf(",")!=-1 ){
                ip = ip.split(",")[0];
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
            System.out.println("Proxy-Client-IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            System.out.println("WL-Proxy-Client-IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
            System.out.println("HTTP_CLIENT_IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            System.out.println("HTTP_X_FORWARDED_FOR ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
            System.out.println("X-Real-IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            System.out.println("getRemoteAddr ip: " + ip);
        }
        System.out.println("获取客户端ip: " + ip);
        return ip;
    }


    public static void main(String[] args) {

//
//        TreeMap<Integer, String> map = new TreeMap<>();
//        List<String> list = Lists.newArrayList("1.0.0.0", "1.0.1.0", "1.0.4.0", "1.0.8.0",
//                "1.0.16.0", "1.0.32.0", "1.0.64.0", "1.0.128.0");
//
//
//        for (String e : list) {
//
//            InetAddress inetAddress = InetAddresses.forString(e);
//            int i = InetAddresses.coerceToInteger(inetAddress);
//            map.put(i, e);
//        }
//        String ip = "1.0.3.234";
//        Integer startIpNum = InetAddresses.coerceToInteger(InetAddresses.forString(ip));
//        String s = map.get(map.floorKey(startIpNum));
//        System.out.println(s);

        String ip1 = "2c0f:ffd8:ffff:f";
        System.out.println(InetAddresses.isInetAddress(ip1));

    }

}
