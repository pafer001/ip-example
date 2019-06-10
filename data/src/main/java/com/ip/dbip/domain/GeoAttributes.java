package com.ip.dbip.domain;


import com.ip.db.entity.IpEntity;

public interface GeoAttributes {

	int getIpType();

	String getIpStartNum();

	String getIpEndNum();

	IpEntity getGeoEntity();
}
