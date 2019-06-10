//package com.ip.dbip.domain;
//
//import com.ip.dbip.utils.Strings;
//import lombok.Builder;
//import lombok.Data;
//
//import java.net.InetAddress;
//
///**
// *
// *
// * @author Ankush Sharma
// */
//@Data
//@Builder
//public class GeoEntity {
//
//	public static final GeoEntity EMPTY = empty();
//
//	private final String ipStart;
//	private final String ipEnd;
//	private final String continent;
//	private final String country;
//	private final String province;
//	private final String city;
//
//	private final Double latitude;
//	private final Double longitude;
//	private final Integer type;
//	private final  String startIpNum;
//	private final String endIpNum;
//
//
//	private static GeoEntity empty() {
//		return GeoEntity
//				.builder()
//				.ipStart(Strings.EMPTY)
//				.ipEnd(Strings.EMPTY)
//				.continent(Strings.EMPTY)
//				.country(Strings.EMPTY)
//				.province(Strings.EMPTY)
//				.city(Strings.EMPTY)
//				.startIpNum(Strings.EMPTY)
//				.endIpNum(Strings.EMPTY)
//				.latitude(0.0)
//				.longitude(0.0)
//				.type(0)
//				.build();
//	}
//
//
//
//}
