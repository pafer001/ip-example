package com.ip.db.dao;

import com.ip.Application;
import com.ip.db.entity.IpEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})// 指定启动类
public class IpDaoTest {


    @Autowired
    private IpDao ipDao;

    @Test
    public void testQuery() {
        IpEntity ipEntity = ipDao.getIpEntity(1L);
        System.out.println(ipEntity);
    }
}
