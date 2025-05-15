package org.yuliu.heima.demos.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuliu.heima.demos.web.pojo.EmpExpr;

import java.util.List;

@Mapper
public interface EmpExprMapper {
    public void addExpr(List<EmpExpr> empExprList);
}
