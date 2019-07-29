package com.accp.sprintboot002.dao;

import com.accp.sprintboot002.pojo.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);
    Users selectBypwd(@Param("name") String name,@Param("pwd") String pwd);
    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}