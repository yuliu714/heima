package org.yuliu.heima.demos.web.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuliu.heima.demos.web.mapper.EmpMapper;
import org.yuliu.heima.demos.web.pojo.Emp;
import org.yuliu.heima.demos.web.pojo.PageResult;
import org.yuliu.heima.demos.web.service.EmpService;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult page(Integer page, Integer pageSize) {
        //获取总记录数
        int total = empMapper.count();
        //获取当前页数的记录
        Integer start = (page - 1) * pageSize;
        List<Emp> emplist= empMapper.list(start, pageSize);

        return new PageResult(total, emplist);
    }
}
