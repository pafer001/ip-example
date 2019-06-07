package com.ip.db.entity;

public class IpEntity {
    private Long id;

    private String ipStart;

    private String ipEnd;

    private String continent;

    private String country;

    private String province;

    private String city;

    private Float latitude;

    private Float longitude;

    private Integer type;

    private String ipStartNum;

    private String ipEndNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpStart() {
        return ipStart;
    }

    public void setIpStart(String ipStart) {
        this.ipStart = ipStart == null ? null : ipStart.trim();
    }

    public String getIpEnd() {
        return ipEnd;
    }

    public void setIpEnd(String ipEnd) {
        this.ipEnd = ipEnd == null ? null : ipEnd.trim();
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIpStartNum() {
        return ipStartNum;
    }

    public void setIpStartNum(String ipStartNum) {
        this.ipStartNum = ipStartNum == null ? null : ipStartNum.trim();
    }

    public String getIpEndNum() {
        return ipEndNum;
    }

    public void setIpEndNum(String ipEndNum) {
        this.ipEndNum = ipEndNum == null ? null : ipEndNum.trim();
    }
}