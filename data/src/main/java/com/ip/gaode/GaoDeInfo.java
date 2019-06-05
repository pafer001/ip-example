package com.ip.gaode;

/**
 * @Author: wangzhenya
 * @Date: 19-4-14 下午7:28
 */
public class GaoDeInfo {

    private String status;

    private String info;

    private String infocode;

    private String province;

    private String city;

    private String adcode;

    private String rectangle;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public String getRectangle() {
        return rectangle;
    }

    public void setRectangle(String rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GaoDeInfo{");
        sb.append("status='").append(status).append('\'');
        sb.append(", info='").append(info).append('\'');
        sb.append(", infocode='").append(infocode).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", adcode='").append(adcode).append('\'');
        sb.append(", rectangle='").append(rectangle).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
