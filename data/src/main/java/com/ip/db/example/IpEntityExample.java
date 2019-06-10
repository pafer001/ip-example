package com.ip.db.example;

import java.util.ArrayList;
import java.util.List;

public class IpEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IpEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIpStartIsNull() {
            addCriterion("ip_start is null");
            return (Criteria) this;
        }

        public Criteria andIpStartIsNotNull() {
            addCriterion("ip_start is not null");
            return (Criteria) this;
        }

        public Criteria andIpStartEqualTo(String value) {
            addCriterion("ip_start =", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotEqualTo(String value) {
            addCriterion("ip_start <>", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartGreaterThan(String value) {
            addCriterion("ip_start >", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartGreaterThanOrEqualTo(String value) {
            addCriterion("ip_start >=", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartLessThan(String value) {
            addCriterion("ip_start <", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartLessThanOrEqualTo(String value) {
            addCriterion("ip_start <=", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartLike(String value) {
            addCriterion("ip_start like", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotLike(String value) {
            addCriterion("ip_start not like", value, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartIn(List<String> values) {
            addCriterion("ip_start in", values, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotIn(List<String> values) {
            addCriterion("ip_start not in", values, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartBetween(String value1, String value2) {
            addCriterion("ip_start between", value1, value2, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpStartNotBetween(String value1, String value2) {
            addCriterion("ip_start not between", value1, value2, "ipStart");
            return (Criteria) this;
        }

        public Criteria andIpEndIsNull() {
            addCriterion("ip_end is null");
            return (Criteria) this;
        }

        public Criteria andIpEndIsNotNull() {
            addCriterion("ip_end is not null");
            return (Criteria) this;
        }

        public Criteria andIpEndEqualTo(String value) {
            addCriterion("ip_end =", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotEqualTo(String value) {
            addCriterion("ip_end <>", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndGreaterThan(String value) {
            addCriterion("ip_end >", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndGreaterThanOrEqualTo(String value) {
            addCriterion("ip_end >=", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndLessThan(String value) {
            addCriterion("ip_end <", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndLessThanOrEqualTo(String value) {
            addCriterion("ip_end <=", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndLike(String value) {
            addCriterion("ip_end like", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotLike(String value) {
            addCriterion("ip_end not like", value, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndIn(List<String> values) {
            addCriterion("ip_end in", values, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotIn(List<String> values) {
            addCriterion("ip_end not in", values, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndBetween(String value1, String value2) {
            addCriterion("ip_end between", value1, value2, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andIpEndNotBetween(String value1, String value2) {
            addCriterion("ip_end not between", value1, value2, "ipEnd");
            return (Criteria) this;
        }

        public Criteria andContinentIsNull() {
            addCriterion("continent is null");
            return (Criteria) this;
        }

        public Criteria andContinentIsNotNull() {
            addCriterion("continent is not null");
            return (Criteria) this;
        }

        public Criteria andContinentEqualTo(String value) {
            addCriterion("continent =", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotEqualTo(String value) {
            addCriterion("continent <>", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentGreaterThan(String value) {
            addCriterion("continent >", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentGreaterThanOrEqualTo(String value) {
            addCriterion("continent >=", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentLessThan(String value) {
            addCriterion("continent <", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentLessThanOrEqualTo(String value) {
            addCriterion("continent <=", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentLike(String value) {
            addCriterion("continent like", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotLike(String value) {
            addCriterion("continent not like", value, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentIn(List<String> values) {
            addCriterion("continent in", values, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotIn(List<String> values) {
            addCriterion("continent not in", values, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentBetween(String value1, String value2) {
            addCriterion("continent between", value1, value2, "continent");
            return (Criteria) this;
        }

        public Criteria andContinentNotBetween(String value1, String value2) {
            addCriterion("continent not between", value1, value2, "continent");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Float value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Float value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Float value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Float value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Float> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Float> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Float value1, Float value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIpStartNumIsNull() {
            addCriterion("ip_start_num is null");
            return (Criteria) this;
        }

        public Criteria andIpStartNumIsNotNull() {
            addCriterion("ip_start_num is not null");
            return (Criteria) this;
        }

        public Criteria andIpStartNumEqualTo(String value) {
            addCriterion("ip_start_num =", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumNotEqualTo(String value) {
            addCriterion("ip_start_num <>", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumGreaterThan(String value) {
            addCriterion("ip_start_num >", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumGreaterThanOrEqualTo(String value) {
            addCriterion("ip_start_num >=", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumLessThan(String value) {
            addCriterion("ip_start_num <", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumLessThanOrEqualTo(String value) {
            addCriterion("ip_start_num <=", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumLike(String value) {
            addCriterion("ip_start_num like", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumNotLike(String value) {
            addCriterion("ip_start_num not like", value, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumIn(List<String> values) {
            addCriterion("ip_start_num in", values, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumNotIn(List<String> values) {
            addCriterion("ip_start_num not in", values, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumBetween(String value1, String value2) {
            addCriterion("ip_start_num between", value1, value2, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpStartNumNotBetween(String value1, String value2) {
            addCriterion("ip_start_num not between", value1, value2, "ipStartNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumIsNull() {
            addCriterion("ip_end_num is null");
            return (Criteria) this;
        }

        public Criteria andIpEndNumIsNotNull() {
            addCriterion("ip_end_num is not null");
            return (Criteria) this;
        }

        public Criteria andIpEndNumEqualTo(String value) {
            addCriterion("ip_end_num =", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumNotEqualTo(String value) {
            addCriterion("ip_end_num <>", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumGreaterThan(String value) {
            addCriterion("ip_end_num >", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumGreaterThanOrEqualTo(String value) {
            addCriterion("ip_end_num >=", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumLessThan(String value) {
            addCriterion("ip_end_num <", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumLessThanOrEqualTo(String value) {
            addCriterion("ip_end_num <=", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumLike(String value) {
            addCriterion("ip_end_num like", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumNotLike(String value) {
            addCriterion("ip_end_num not like", value, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumIn(List<String> values) {
            addCriterion("ip_end_num in", values, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumNotIn(List<String> values) {
            addCriterion("ip_end_num not in", values, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumBetween(String value1, String value2) {
            addCriterion("ip_end_num between", value1, value2, "ipEndNum");
            return (Criteria) this;
        }

        public Criteria andIpEndNumNotBetween(String value1, String value2) {
            addCriterion("ip_end_num not between", value1, value2, "ipEndNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
