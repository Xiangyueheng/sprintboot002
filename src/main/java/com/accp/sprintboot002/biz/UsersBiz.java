package com.accp.sprintboot002.biz;

import com.accp.sprintboot002.dao.UsersMapper;
import com.accp.sprintboot002.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiangyueheng
 * @create 2019-07-27 16:52
 */
@Service
public class UsersBiz {
    @Autowired
    private UsersMapper dao;
    public Users selectBypwd( String name, String pwd){
        return dao.selectBypwd(name, pwd);
    }
}
