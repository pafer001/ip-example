package com.ip.dbip.domain;

import java.net.InetAddress;

public interface GeoAttributes {

	InetAddress getStartInetAddress();

	InetAddress getEndInetAddress();

	GeoEntity getGeoEntity();
}
