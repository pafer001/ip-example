package com.ip.ipapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @Author: wangzhenya
 * @Date: 19-4-14 下午2:12
 */
public class IpApiHttpUtils {


    public static IpApiEntity getIpApiEntity(String ip) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<IpApiEntity> entity = restTemplate.getForEntity("http://ip-api.com/json/" + ip,
                IpApiEntity.class, new HashMap<>());


        if (entity.getBody() == null || !entity.getBody().getStatus().equals("success")) {
            return new IpApiEntity();
        }
        return entity.getBody();

    }

    public static void main(String[] args) {
        System.out.println(IpApiHttpUtils.getIpApiEntity("36.102.10.147"));
    }
}
