package com.accp.sprintboot002.action;

import com.accp.sprintboot002.biz.ItemtypeBiz;
import com.accp.sprintboot002.biz.PeitemBiz;
import com.accp.sprintboot002.pojo.Peitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiangyueheng
 * @create 2019-07-29 9:17
 */
@Controller
@RequestMapping("/c")
public class PeitemAction {
    @Autowired
    private PeitemBiz peitemBiz;
    @Autowired
    private ItemtypeBiz itemtypeBiz;

    @RequestMapping("/pei/selall")
    public String seltypeAll(Model model){
        model.addAttribute("list",itemtypeBiz.selAll());
        return "Peitem";
    }

    @RequestMapping("/pei/selallbyid")
    public String selpei(Model model,int typeid){
        model.addAttribute("list",itemtypeBiz.selAll());
        model.addAttribute("peilist",peitemBiz.selectBytypeid(typeid));
        return "Peitem";
    }

    @RequestMapping("/pei/selpeibyid")
    public String selpeibyid(Model model,int id){
        model.addAttribute("list",itemtypeBiz.selAll());
        model.addAttribute("pei",peitemBiz.selectByPrimaryKey(id));
        return "updatePei";
    }

    @RequestMapping("/pei/update")
    public String update(Model model, Peitem peitem){
        System.out.println("接受的对象"+peitem);
        peitemBiz.updateByPrimaryKeySelective(peitem);
        return this.seltypeAll(model);
    }
}
