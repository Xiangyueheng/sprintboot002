package com.accp.sprintboot002.biz;

import com.accp.sprintboot002.dao.ItemtypeMapper;
import com.accp.sprintboot002.pojo.Itemtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-07-29 9:10
 */
@Service
public class ItemtypeBiz {
    @Autowired
    private ItemtypeMapper dao;

    public List<Itemtype> selAll(){
        return dao.selAll();
    }
}
