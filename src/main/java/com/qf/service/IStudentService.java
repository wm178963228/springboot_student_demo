package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @author wangming
 * @Date 2019/6/26
 */
public interface IStudentService {
    List<Student> queryAll();

    int insertStudent(Student student);

    int deleteStudent(Integer sid);
}
