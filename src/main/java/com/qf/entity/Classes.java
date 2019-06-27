package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangming
 * @Date 2019/6/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable{

    private Integer id;
    private String cname;
    private Integer csum;
}
