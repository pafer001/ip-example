package com.ip.db.mapper;

import com.ip.db.entity.IpEntity;
import com.ip.db.entity.IpEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpEntityMapper {
    int countByExample(IpEntityExample example);

    int deleteByExample(IpEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IpEntity record);

    int insertSelective(IpEntity record);

    List<IpEntity> selectByExample(IpEntityExample example);

    IpEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IpEntity record, @Param("example") IpEntityExample example);

    int updateByExample(@Param("record") IpEntity record, @Param("example") IpEntityExample example);

    int updateByPrimaryKeySelective(IpEntity record);

    int updateByPrimaryKey(IpEntity record);
}