package com.accp.sprintboot002.biz;

import com.accp.sprintboot002.dao.PeitemMapper;
import com.accp.sprintboot002.pojo.Peitem;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-07-29 9:16
 */
@Service
public class PeitemBiz {
    @Autowired
    private PeitemMapper dao;
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public int updateByPrimaryKeySelective(Peitem record){
        return dao.updateByPrimaryKeySelective(record);
    }
    public List<Peitem> selectBytypeid( int typeid){
        return dao.selectBytypeid(typeid);
    }
    public  Peitem selectByPrimaryKey(Integer itemid){
        return dao.selectByPrimaryKey(itemid);
    }
}
