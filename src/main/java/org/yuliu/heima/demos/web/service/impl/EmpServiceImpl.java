package org.yuliu.heima.demos.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuliu.heima.demos.web.mapper.EmpMapper;
import org.yuliu.heima.demos.web.pojo.Emp;
import org.yuliu.heima.demos.web.pojo.EmpQueryParam;
import org.yuliu.heima.demos.web.pojo.PageResult;
import org.yuliu.heima.demos.web.service.EmpService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult page(EmpQueryParam empRequestParam) {
        //1分页参数
        PageHelper.startPage(empRequestParam.getPage(), empRequestParam.getPageSize());
        //2查询
        List<Emp> emplist = empMapper.list(empRequestParam);
        Page<Emp> p=(Page<Emp>)emplist;
        return new PageResult(p.getTotal(), p.getResult());
    }
    @Override
    public void add(Emp emp) {
        //补全属性
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        //调用mapper保存
        empMapper.add(emp);
    }

    @Test
    public void test(){
        System.out.println("test");
    }
}
