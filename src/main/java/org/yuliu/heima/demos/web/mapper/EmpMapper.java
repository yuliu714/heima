package org.yuliu.heima.demos.web.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.yuliu.heima.demos.web.pojo.Emp;
import org.yuliu.heima.demos.web.pojo.EmpQueryParam;

import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id ")
    public Long count();

    public List<Emp> list(EmpQueryParam empRequestParam);
}
