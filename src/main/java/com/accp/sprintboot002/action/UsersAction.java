package com.accp.sprintboot002.action;

import com.accp.sprintboot002.biz.UsersBiz;
import com.accp.sprintboot002.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangyueheng
 * @create 2019-07-27 17:28
 */
@Controller
@RequestMapping("/c")
public class UsersAction {
    @Autowired
    private UsersBiz usersBiz;
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,String> login(String name, String pwd, HttpSession session){
        Users users = usersBiz.selectBypwd(name, pwd);
        Map<String,String> map=new HashMap<String, String>();
        if (users != null) {
            map.put("code","200");
            session.setAttribute("user",users);
        }else {
            map.put("code","404");
        }
        return map;
    }

}
