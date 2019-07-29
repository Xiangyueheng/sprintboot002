package com.accp.sprintboot002.biz;

import com.accp.sprintboot002.dao.RecordMapper;
import com.accp.sprintboot002.pojo.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-07-27 16:54
 */
@Service
public class RecordBiz {
    @Autowired
    private RecordMapper dao;
    public List<Record> selectAll(){
        return dao.selectAll();
    }
    public List<Record> selectByCode(String code){
        return dao.selectByCode(code);
    }
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public  int insertSelective(Record record){
        return dao.insertSelective(record);
    }
}
