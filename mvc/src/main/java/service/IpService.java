package service;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ip.dbip.domain.GeoEntity;
import com.ip.gaode.GaoDeInfo;
import com.ip.gaode.GaoDeIpUtils;
import com.ip.ipapi.IpApiEntity;
import com.ip.ipapi.IpApiHttpUtils;
import com.ip.mvc.IpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//import com.ip.dbip.utils.Country;

/**
 * @Author: wangzhenya
 * @Date: 19-4-20 下午1:42
 */
@Service("ipService")
@Slf4j
public class IpService {


    public Map<String, String> getIpMap(String ip) {
        GaoDeInfo gaoDeInfo = GaoDeIpUtils.getGaoDeInfo(ip);
        Map<String, String> infoMap = Maps.newHashMap();

        if (gaoDeInfo != null) {
            infoMap.put("city", gaoDeInfo.getCity());
            infoMap.put("templates/ip", ip);

            infoMap.put("province", gaoDeInfo.getProvince());
            infoMap.put("point", gaoDeInfo.getRectangle());
//                dataMap.put("data", infoMap);
        }

        return infoMap;
    }

    private String getAddress(IpApiEntity ipApiEntity, GeoEntity geoEntity) {
        if (geoEntity != null) {

//            List<String> address = Lists.newArrayList(Country.from(geoEntity.getCountryCode()), geoEntity.getProvince(), geoEntity.getCity());
//            return (Joiner.on(",").join(address));
        } else if (ipApiEntity != null){
            List<String> address = Lists.newArrayList(ipApiEntity.getCountry(), ipApiEntity.getRegion(), ipApiEntity.getCity());
            return (Joiner.on(",").join(address));
        }

        return "";
    }
    public IpVo getIpVo(String ip) {

        long l = System.currentTimeMillis();
        IpVo ipVo = new IpVo();

        IpApiEntity ipApiEntity = IpApiHttpUtils.getIpApiEntity(ip);
//        GeoEntity geoEntity = DbIpClient.lookup(ip);
//        log.info("method=getIpVo ip={}, ipApiEntity={}, geoEntity={}, t={}", ip, ipApiEntity, geoEntity, System.currentTimeMillis() - l);
        ipVo.setAddress(getAddress(ipApiEntity, null));
        ipVo.setIp(ip);

        if (ipApiEntity == null) {
            return ipVo;
        }
        ipVo.setAs(ipApiEntity.getAs());
        ipVo.setIsp(ipApiEntity.getIsp());
        ipVo.setPoint(ipApiEntity.getLat() +","+ ipApiEntity.getLon());
        ipVo.setTimezone(ipApiEntity.getTimezone());
        ipVo.setZip(ipApiEntity.getZip());

        return ipVo;
    }
}
