package com.accp.sprintboot002.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiangyueheng
 * @create 2019-07-28 14:03
 */
@RequestMapping("/page")
@Controller
public class page {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/peitem")
    public String peitem(){
        return "peitem";
    }
}
