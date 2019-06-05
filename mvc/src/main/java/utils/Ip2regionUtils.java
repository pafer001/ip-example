package utils;

import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbSearcher;
import org.lionsoul.ip2region.Util;

import java.io.File;
import java.lang.reflect.Method;

/**
 * @Author: wangzhenya
 * @Date: 19-5-10 下午8:39
 */
public class Ip2regionUtils {


    public static String getCityInfo(String ip){

        //db
        String dbPath = Ip2regionUtils.class.getResource("/ip2region.db").getPath();

        File file = new File(dbPath);
        if ( file.exists() == false ) {
            System.out.println("Error: Invalid ip2region.db file");
        }

        //查询算法
        int algorithm = DbSearcher.BTREE_ALGORITHM; //B-tree
        try {
            DbConfig config = new DbConfig();
            DbSearcher searcher = new DbSearcher(config, dbPath);

            //define the method
            Method method = null;
            switch ( algorithm )
            {
                case DbSearcher.BTREE_ALGORITHM:
                    method = searcher.getClass().getMethod("btreeSearch", String.class);
                    break;
                case DbSearcher.BINARY_ALGORITHM:
                    method = searcher.getClass().getMethod("binarySearch", String.class);
                    break;
                case DbSearcher.MEMORY_ALGORITYM:
                    method = searcher.getClass().getMethod("memorySearch", String.class);
                    break;
            }

            DataBlock dataBlock = null;
            if ( Util.isIpAddress(ip) == false ) {
                System.out.println("Error: Invalid ip address");
            }

            dataBlock  = (DataBlock) method.invoke(searcher, ip);

            String region = dataBlock.getRegion();

            return region.replace("|0|", ",")
                    .replace("|", ",").replace(",0", "");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void main(String[] args)  throws Exception{
        System.err.println(getCityInfo("220.248.12.158"));
//
        System.err.println(getCityInfo("144.34.237.200"));
        System.err.println(getCityInfo("169.235.24.133"));
        System.err.println(getCityInfo("153.19.50.62"));
        System.err.println(getCityInfo("203.69.66.102"));
        System.err.println(getCityInfo("59.39.145.178"));
        System.err.println(getCityInfo("220.194.58.240"));
        System.err.println(getCityInfo("210.51.23.244"));



    }
}
