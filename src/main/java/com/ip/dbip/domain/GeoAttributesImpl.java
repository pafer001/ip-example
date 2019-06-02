package com.ip.dbip.domain;

import com.ip.dbip.utils.Strings;

import java.net.InetAddress;

public final class GeoAttributesImpl implements GeoAttributes {

	private final String city;
	private final String continentCode;
//	private final String country;
	private final String province ;
	private final String countryCode;
	private final InetAddress startInetAddress;
	private final InetAddress endInetAddress;
	private final String ip;

	private GeoAttributesImpl(final Builder builder) {
		this.startInetAddress = builder.startInetAddress;
		this.endInetAddress = builder.endInetAddress;
		this.city = builder.city;
		this.continentCode = builder.continentCode;
		this.province = builder.province;
		this.countryCode = builder.countryCode;
		this.ip = builder.ip;
	}

	public static class Builder{
		private InetAddress startInetAddress;
		private InetAddress endInetAddress;
		private String city;
		private String continentCode;
		private String province ;
		private String countryCode;
		private String ip;

		public Builder withIp(String ip) {
			this.ip = ip;
			return this;
		}

		public Builder withStartInetAddress(final InetAddress startInetAddress){
			this.startInetAddress = startInetAddress;
			return this;
		}

		public Builder withCountryCode(final String countryCode){
			this.countryCode = countryCode;
			return this;
		}
		public Builder withEndInetAddress(final InetAddress endInetAddress){
			this.endInetAddress = endInetAddress;
			return this;
		}


		public Builder withCity(final String city){
			this.city = city;
			return this;
		}


		public Builder withContinentCode(final String continentCode){
			this.continentCode = continentCode;
			return this;
		}


		public Builder withProvince(final String province){
			this.province = province;
			return this;
		}

		public GeoAttributesImpl build(){
			return new GeoAttributesImpl(this);
		}
	}



	@Override
	public InetAddress getStartInetAddress() {
		return startInetAddress;
	}

	@Override
	public InetAddress getEndInetAddress() {
		return endInetAddress;
	}

	@Override
	public GeoEntity getGeoEntity() {
		return GeoEntity
				.builder()
				.city(city)
				.countryCode(countryCode)
				.province(province)
				.ip(ip)
				.continentCode(continentCode)
				.build();
	}


}
