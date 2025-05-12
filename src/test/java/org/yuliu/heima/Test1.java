package org.yuliu.heima;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yuliu.heima.demos.web.mapper.EmpMapper;
import org.yuliu.heima.demos.web.pojo.Emp;

import java.util.List;

@SpringBootTest
public class Test1 {
    @Autowired
    private EmpMapper empMapper;


    @Test
    public void test(){
        System.out.println(empMapper.count());
        }

}
