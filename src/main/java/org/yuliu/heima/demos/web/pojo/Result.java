

package org.yuliu.heima.demos.web.pojo;

import lombok.Data;

@Data
public class Result {
    private int code;//1成功 0失败
    private String msg;
    private Object data;//Object是所有java的基类

    //成功响应
    public static Result success() {
        Result result = new Result();
        result.code =1;
        result.msg = "success";
        return result;
    }
    //重载
    public static Result success(Object data) {
        Result result = new Result();
        result.data=data;
        result.code =1;
        result.msg = "success";
        return result;
    }

    //error
    public static Result error(String msg) {
        Result result = new Result();
        result.msg=msg;
        result.code =0;
        return result;
    }

}
