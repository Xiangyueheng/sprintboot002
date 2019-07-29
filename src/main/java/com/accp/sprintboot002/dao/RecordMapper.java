package com.accp.sprintboot002.dao;

import com.accp.sprintboot002.pojo.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);
    List<Record> selectAll();
    List<Record> selectByCode(@Param("code") String code);
    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}