package com.ip.db;

import com.google.common.collect.Lists;
import com.ip.dbip.domain.GeoEntity;

import java.util.List;
import java.util.Map;

public class IpDao {

    public static String SELECT_SQL = "select * from t_ip";

    public List<GeoEntity> selectAllGeoEntity() {

        Map<String, Object> map = BaseJdbcTemplate.getJdbcTemplate().queryForMap(SELECT_SQL);

        return Lists.newArrayList();
    }

    public static void main(String[] args) {

        List<GeoEntity> geoEntities = new IpDao().selectAllGeoEntity();
        System.out.println(geoEntities);
    }
}
