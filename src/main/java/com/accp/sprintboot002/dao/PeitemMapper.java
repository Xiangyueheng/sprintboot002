package com.accp.sprintboot002.dao;

import com.accp.sprintboot002.pojo.Peitem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeitemMapper {
    int deleteByPrimaryKey(Integer itemid);

    int insert(Peitem record);

    int insertSelective(Peitem record);

    Peitem selectByPrimaryKey(Integer itemid);
    List<Peitem> selectBytypeid(@Param("typeid") int typeid);

    int updateByPrimaryKeySelective(Peitem record);

    int updateByPrimaryKey(Peitem record);
}