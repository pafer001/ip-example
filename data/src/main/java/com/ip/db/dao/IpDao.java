package com.ip.db.dao;

import com.ip.db.entity.IpEntity;
import com.ip.db.mapper.IpEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ipDao")
public class IpDao {

    @Autowired
    private IpEntityMapper ipEntityMapper;

    public IpEntity getIpEntity(long id) {

       return ipEntityMapper.selectByPrimaryKey(id);
    }

    public int insert(IpEntity ipEntity) {

        return ipEntityMapper.insert(ipEntity);
    }

}
