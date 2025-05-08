package org.yuliu.heima.demos.web.service;


import org.yuliu.heima.demos.web.pojo.Dept;

import java.util.List;

public interface DeptService {
    public List<Dept> findAll();
    //service里先写interface接口，简洁点
    public int deleteById(Integer id);
    public void add(Dept dept);
    public Dept findById(Integer id);
    public void update(Dept dept);
}
