package ipapi;

/**
 * @Author: wangzhenya
 * @Date: 19-5-10 下午10:29
 */
public class IpApiEntity {

    private String as;
    private String city;
    private String country;
    private String countryCode;
    private String isp;
    private String lat;
    private String lon;
    private String org;
    private String query;
    private String region;
    private String regionName;
    private String status;
    private String timezone;
    private String zip;

    public IpApiEntity() {
        this.as = "";
        this.city = "";
        this.country = "";
        this.countryCode = "";
        this.lat = "";
        this.lon = "";
        this.org = "";
        this.query = "";
        this.region = "";
        this.regionName = "";
        this.status = "";
        this.timezone = "";
        this.zip = "";
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IpApiEntity{");
        sb.append("as='").append(as).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", lat='").append(lat).append('\'');
        sb.append(", lon='").append(lon).append('\'');
        sb.append(", org='").append(org).append('\'');
        sb.append(", query='").append(query).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append(", regionName='").append(regionName).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", timezone='").append(timezone).append('\'');
        sb.append(", zip='").append(zip).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
