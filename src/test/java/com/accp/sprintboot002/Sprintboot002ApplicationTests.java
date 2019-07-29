package com.accp.sprintboot002;

import com.accp.sprintboot002.biz.ItemtypeBiz;
import com.accp.sprintboot002.biz.RecordBiz;
import com.accp.sprintboot002.biz.StudentBiz;
import com.accp.sprintboot002.biz.UsersBiz;
import com.accp.sprintboot002.dao.UsersMapper;
import com.accp.sprintboot002.pojo.Itemtype;
import com.accp.sprintboot002.pojo.Student;
import com.accp.sprintboot002.pojo.Users;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sprintboot002ApplicationTests {
@Autowired
private StudentBiz studentBiz;
@Autowired
private UsersBiz usersBiz;
@Autowired
private RecordBiz recordBiz;
@Autowired
private ItemtypeBiz itemtypeBiz;
    @Test
    public void contextLoads() {
//        Users admin = usersBiz.selectBypwd("admin", "1234");
////        System.out.println(admin);
//        recordBiz.selectByCode("aa");
//        PageInfo<Student> studentPageInfo = studentBiz.selectAll(1);
        List<Itemtype> itemtypes = itemtypeBiz.selAll();
        for (Itemtype itemtype : itemtypes) {
            System.out.println(itemtype);
            System.out.println(itemtype.getList());
        }
//        System.out.println(studentPageInfo.toString());
//        for (Student student : studentPageInfo.getList()) {
//            System.out.println(student.toString());
//        }
//        studentBiz.insertSelective(new Student("c001","张三",1,"Y2",1,new Date(),"17711645235",1));
    }

}
