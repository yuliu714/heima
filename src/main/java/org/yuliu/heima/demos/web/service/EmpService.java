package org.yuliu.heima.demos.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuliu.heima.demos.web.mapper.EmpMapper;
import org.yuliu.heima.demos.web.pojo.EmpQueryParam;
import org.yuliu.heima.demos.web.pojo.PageResult;

@Service
public interface EmpService {
    PageResult page(EmpQueryParam param);
}
