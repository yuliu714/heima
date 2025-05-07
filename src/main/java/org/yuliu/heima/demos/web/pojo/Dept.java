package org.yuliu.heima.demos.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data//基础lombok
@NoArgsConstructor//无参构造
@AllArgsConstructor//有参构造
public class Dept {
    private int id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
