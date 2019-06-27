package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

/**
 * @author wangming
 * @Date 2019/6/26
 */
public interface IClassesService {
    Classes queryById(Integer cid);

    List<Classes> queryAll();

}
