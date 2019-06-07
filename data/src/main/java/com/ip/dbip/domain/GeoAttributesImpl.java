package com.ip.dbip.domain;

import com.google.common.base.Strings;
import com.google.common.net.InetAddresses;
import com.ip.dbip.utils.IPUtils;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public final class GeoAttributesImpl implements GeoAttributes {

	private final String ipStart;
	private final String ipEnd;
	private final String continent;
	private final String country;
	private final String province ;
	private final String city;
	private final Double latitude;
	private final Double longitude;
	@Override
	public int getIpType() {
		return InetAddresses.forString(ipStart) instanceof Inet4Address ? 1 :2;
	}

	@Override
	public String getIpStartNum() {
		if(getIpType() == 2) {
			return IPUtils.ipv6ToBigInteger(InetAddresses.forString(ipStart)).toString();
		} else if (getIpType() == 1) {
			return String.valueOf(InetAddresses.coerceToInteger(InetAddresses.forString(ipStart)));
		}
		return "";
	}

	@Override
	public String getIpEndNum() {
		if(getIpType() == 2) {
			return IPUtils.ipv6ToBigInteger(InetAddresses.forString(ipEnd)).toString();
		} else if (getIpType() == 1) {
			return String.valueOf(InetAddresses.coerceToInteger(InetAddresses.forString(ipEnd)));
		}
		return "";
	}

	private GeoAttributesImpl(final Builder builder) {
		this.ipStart = builder.ipStart;
		this.ipEnd = builder.ipEnd;
		this.continent = builder.continent;
		this.country = builder.country;
		this.province = builder.province;

		this.city = builder.city;
		this.latitude = builder.latitude;
		this.longitude = builder.longitude;
	}

	public static class Builder{
		private  String ipStart;
		private  String ipEnd;
		private  String continent;
		private  String country;
		private  String province ;
		private  String city;

		private  Double latitude;
		private  Double longitude;



		public Builder withIpStart(String ipStart) {
			this.ipStart = ipStart;
			return this;
		}

		public Builder withIpEnd( String ipEnd){
			this.ipEnd = ipEnd;
			return this;
		}

		public Builder withContinent( String continent){
			this.continent = continent;
			return this;
		}

		public Builder withCountry(final String country){
			this.country = country;
			return this;
		}

		public Builder withProvince(final String province){
			this.province = province;
			return this;
		}

		public Builder withCity(final String city){
			this.city = city;
			return this;
		}

		public Builder withLatitude(final String latitude){

			this.latitude = Strings.isNullOrEmpty(latitude) ? 0.0 : Double.parseDouble(latitude);
			return this;
		}

		public Builder withLongitude(final String longitude){

			this.longitude = Strings.isNullOrEmpty(longitude) ? 0.0 : Double.parseDouble(longitude);
			return this;
		}

		public GeoAttributesImpl build(){
			return new GeoAttributesImpl(this);
		}
	}


	@Override
	public GeoEntity getGeoEntity() {
		return GeoEntity
				.builder()
				.ipStart(ipStart)
				.ipEnd(ipEnd)
				.continent(continent)
				.country(country)
				.province(province)
				.city(city)
				.latitude(latitude)
				.longitude(longitude)
				.type(getIpType())
				.startIpNum(getIpStartNum())
				.endIpNum(getIpEndNum())
				.build();
	}


}
