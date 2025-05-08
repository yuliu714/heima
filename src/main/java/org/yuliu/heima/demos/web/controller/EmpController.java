package org.yuliu.heima.demos.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yuliu.heima.demos.web.pojo.PageResult;
import org.yuliu.heima.demos.web.pojo.Result;
import org.yuliu.heima.demos.web.service.EmpService;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue="1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("分页查询员工，参数page，pageSize：{},{}", page, pageSize);
        PageResult pageResult = empService.page(page, pageSize);
        return Result.success(pageResult);
    }
}
