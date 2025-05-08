package org.yuliu.heima.demos.web.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PageResult {
    private int total;
    private List rows;
}
