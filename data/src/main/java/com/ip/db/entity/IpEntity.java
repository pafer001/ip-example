package com.ip.db.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Setter
@Getter
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

}
