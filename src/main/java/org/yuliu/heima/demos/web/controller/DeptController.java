package org.yuliu.heima.demos.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yuliu.heima.demos.web.pojo.Dept;
import org.yuliu.heima.demos.web.pojo.Result;
import org.yuliu.heima.demos.web.service.DeptService;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/depts")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list() {
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    @DeleteMapping
    public Result delete( Integer deptId) {
        System.out.println("删除的id为:"+deptId);
        //又是controller调用service
        deptService.deleteById(deptId);
        return Result.success();
    }

    //ok这个新增的后端接口我来写，
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        System.out.println(dept.getName());
        //又是controller调用service
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptService.add(dept);
        return Result.success();
    }
    //这个也自己写
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Dept dept = deptService.findById(id);
        return Result.success(dept);
    }
    //修改
    @PutMapping
    public Result update(@RequestBody Dept dept){
        System.out.println("修改的部门为："+dept);
        deptService.update(dept);
        return Result.success();
    }
}