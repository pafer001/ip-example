package com.ip.mvc;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.ip.service.IpService;
import com.ip.utils.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Author: wangzhenya
 * @Date: 19-4-14 下午7:57
 */
@RestController
@RequestMapping("/ip")
public class IpController {


    @Autowired
    private IpService ipService;

    @RequestMapping("/get")
    public Map<String, Object> getIp(@RequestParam(value="ip") String ip, HttpServletRequest request) {

        try {
            if (Strings.isNullOrEmpty(ip)) {
                ip = IpUtils.getIpAddr(request);
            }
            Map<String, Object> dataMap = Maps.newHashMap();
            dataMap.put("code", "1000");
            dataMap.put("message", "success");
            dataMap.putAll(ipService.getIpMap(ip));
            return dataMap;
        } catch (Exception e) {
            e.printStackTrace();
            Map<String, Object> dataMap = Maps.newHashMap();
            dataMap.put("code", "1001");
            dataMap.put("message", "error");
            return dataMap;
        }

    }

    @RequestMapping("/get/v1")
    public Map<String, Object> getV1Ip(@RequestParam(value="ip") String ip, HttpServletRequest request) {

        try {
            if (Strings.isNullOrEmpty(ip)) {
                ip = IpUtils.getIpAddr(request);
            }
            Map<String, Object> dataMap = Maps.newHashMap();
            dataMap.put("code", "1000");
            dataMap.put("message", "success");
            dataMap.putAll(ipService.getIpV1Map(ip));
            return dataMap;
        } catch (Exception e) {
            e.printStackTrace();
            Map<String, Object> dataMap = Maps.newHashMap();
            dataMap.put("code", "1001");
            dataMap.put("message", "error");
            return dataMap;
        }

    }
}
