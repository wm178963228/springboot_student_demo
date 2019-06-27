package com.qf.service.impl;

import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangming
 * @Date 2019/6/26
 */
@Service
public class ClassesServiceImpl implements IClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public Classes queryById(Integer cid) {
        return classesMapper.selectById(cid);
    }

    @Override
    public List<Classes> queryAll() {
        return classesMapper.selectList(null);
    }
}
