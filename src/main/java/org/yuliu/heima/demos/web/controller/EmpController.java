package org.yuliu.heima.demos.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.yuliu.heima.demos.web.pojo.Emp;
import org.yuliu.heima.demos.web.pojo.EmpQueryParam;
import org.yuliu.heima.demos.web.pojo.PageResult;
import org.yuliu.heima.demos.web.pojo.Result;
import org.yuliu.heima.demos.web.service.EmpService;

import java.time.LocalDate;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(EmpQueryParam empRequestParam){
        log.info("分页查询员工，参数empRequestParam：{},{}", empRequestParam);
        log.info("begin={}, end={}", empRequestParam.getBegin(), empRequestParam.getEnd());
        PageResult pageResult = empService.page(empRequestParam);
        return Result.success(pageResult);
    }

    @PostMapping
    public Result add(@RequestBody Emp emp){
        log.info("新增员工：{}", emp);
        empService.add(emp);
        return Result.success();
    }
}
