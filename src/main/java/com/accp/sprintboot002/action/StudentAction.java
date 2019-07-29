package com.accp.sprintboot002.action;

import com.accp.sprintboot002.biz.RecordBiz;
import com.accp.sprintboot002.biz.StudentBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiangyueheng
 * @create 2019-07-28 14:45
 */
@Controller
@RequestMapping("/c")
public class StudentAction {
    @Autowired
    private StudentBiz studentBiz;
    @Autowired
    private RecordBiz recordBiz;

    @RequestMapping("/stu/selall")
    public String selall(Model model, int page) {
        model.addAttribute("student", studentBiz.selectAll(page));
        return "studnet";
    }

    @RequestMapping("/stu/addtz")
    public String selall(Model model) {
        model.addAttribute("student", studentBiz.selectAll2());
        return "addhtml";
    }
}