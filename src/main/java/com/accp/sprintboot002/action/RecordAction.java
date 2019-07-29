package com.accp.sprintboot002.action;

import com.accp.sprintboot002.biz.RecordBiz;
import com.accp.sprintboot002.pojo.Record;
import com.accp.sprintboot002.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author xiangyueheng
 * @create 2019-07-28 15:32
 */
@Controller
@RequestMapping("/c")
public class RecordAction {
    @Autowired
    private RecordBiz recordBiz;

    @RequestMapping("/record/selall")
    public String selall(Model model){
        model.addAttribute("list",recordBiz.selectAll());
        return "record";
    }

    @RequestMapping("/record/selbycode")
    public String selbycode(Model model,String code){
        model.addAttribute("list",recordBiz.selectByCode(code));
        return "recordBycode";
    }

    @RequestMapping("/record/add")
    public String add(Model model, Record record, HttpSession session){
        Users user= (Users) session.getAttribute("user");
        record.setCreateby(user.getName());
        record.setCreatedate(new Date());

        System.out.println(record.toString());
        recordBiz.insertSelective(record);
        return this.selall(model);
    }
}
