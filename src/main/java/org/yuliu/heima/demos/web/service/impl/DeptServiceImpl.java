package org.yuliu.heima.demos.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuliu.heima.demos.web.mapper.DeptMapper;
import org.yuliu.heima.demos.web.pojo.Dept;
import org.yuliu.heima.demos.web.service.DeptService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept>  findAll() {
        return deptMapper.findAll();
    }
    public void deleteById(Integer deptId) {
        deptMapper.deleteById(deptId);
        //impl里调用mapper，最后到mapper里实现sql操作
    }
    public void add(Dept dept) {
        deptMapper.add(dept);
    }
    public Dept findById(Integer id) {
        return deptMapper.findById(id);
    }
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}
