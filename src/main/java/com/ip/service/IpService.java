package com.ip.service;

import com.google.common.collect.Maps;
import com.ip.gaode.GaoDeInfo;
import com.ip.gaode.GaoDeIpUtils;
import com.ip.ipapi.IpApiEntity;
import com.ip.ipapi.IpApiHttpUtils;
import com.ip.utils.Ip2regionUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: wangzhenya
 * @Date: 19-4-20 下午1:42
 */
@Service("ipService")
public class IpService {

    public Map<String, String> getIpMap(String ip) {
        GaoDeInfo gaoDeInfo = GaoDeIpUtils.getGaoDeInfo(ip);
        Map<String, String> infoMap = Maps.newHashMap();

        if (gaoDeInfo != null) {
            infoMap.put("city", gaoDeInfo.getCity());
            infoMap.put("ip", ip);

            infoMap.put("province", gaoDeInfo.getProvince());
            infoMap.put("point", gaoDeInfo.getRectangle());
//                dataMap.put("data", infoMap);
        }

        return infoMap;
    }

    public Map<String, Object> getIpV1Map(String ip) {
        IpApiEntity ipApiEntity = IpApiHttpUtils.getIpApiEntity(ip);
        Map<String, Object> infoMap = Maps.newHashMap();
        infoMap.put("location", Ip2regionUtils.getCityInfo(ip));
        infoMap.put("detailInfo", ipApiEntity);
        infoMap.put("ip", ip);
        return infoMap;
    }
}
