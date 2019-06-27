package com.qf.service.impl;

import com.qf.dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangming
 * @Date 2019/6/26
 */
@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StuMapper stuMapper;

    @Autowired
    private IClassesService classesService;

    @Override
    public List<Student> queryAll() {
        List<Student> students = stuMapper.selectList(null);
        for (Student student : students) {
            Classes classes = classesService.queryById(student.getCid());
            student.setClasses(classes);
        }

        return students;
    }

    @Override
    public int insertStudent(Student student) {

        return stuMapper.insert(student);
    }

    @Override
    public int deleteStudent(Integer sid) {

        return stuMapper.deleteById(sid);
    }
}
