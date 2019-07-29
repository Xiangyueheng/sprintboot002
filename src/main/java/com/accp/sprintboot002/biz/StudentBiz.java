package com.accp.sprintboot002.biz;

import com.accp.sprintboot002.dao.StudentMapper;
import com.accp.sprintboot002.pojo.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-07-27 16:53
 */
@Service
public class StudentBiz {
    @Autowired
    private StudentMapper dao;
    public PageInfo<Student> selectAll(int page){
        PageHelper.startPage(page,2);
        return new PageInfo<Student>(dao.selectAll());
    }
    public List<Student> selectAll2(){

        return dao.selectAll();
    }
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public  int deleteByPrimaryKey(Integer id){
        return dao.deleteByPrimaryKey(id);
    }
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public   int insertSelective(Student record){
        return dao.insertSelective(record);
    }

    public   Student selectByPrimaryKey(Integer id){
        return dao.selectByPrimaryKey(id);
    }
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public  int updateByPrimaryKeySelective(Student record){
        return dao.updateByPrimaryKeySelective(record);
    }



}
