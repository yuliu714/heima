package org.yuliu.heima.demos.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
        PageResult pageResult = empService.page(empRequestParam);
        return Result.success(pageResult);
    }
}
