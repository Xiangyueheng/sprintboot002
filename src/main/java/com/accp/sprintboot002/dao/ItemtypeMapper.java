package com.accp.sprintboot002.dao;

import com.accp.sprintboot002.pojo.Itemtype;

import java.util.List;

public interface ItemtypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(Itemtype record);

    int insertSelective(Itemtype record);

    List<Itemtype> selAll();

    Itemtype selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(Itemtype record);

    int updateByPrimaryKey(Itemtype record);
}