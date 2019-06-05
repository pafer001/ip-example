package gaode;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @Author: wangzhenya
 * @Date: 19-4-14 下午7:27
 */
public class GaoDeIpUtils {


    static String IP_URL = "https://restapi.amap.com/v3/ip?key=0195bf83f0f03a95ef4080096cf50153&ip=";

    public static GaoDeInfo getGaoDeInfo(String ip) {

        try {
            ResponseEntity<GaoDeInfo> entity = new RestTemplate().getForEntity(IP_URL + ip, GaoDeInfo.class, new HashMap<>());
            if (entity.getStatusCode() == HttpStatus.OK) {
                return entity.getBody();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {

        GaoDeInfo gaoDeInfo = getGaoDeInfo("223.20.165.76");
        System.out.println(gaoDeInfo);
    }
}
