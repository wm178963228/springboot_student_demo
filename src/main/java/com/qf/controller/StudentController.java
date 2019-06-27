package com.qf.controller;

import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wangming
 * @Date 2019/6/26
 */

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private IClassesService classesService;

    @RequestMapping("/list")
    public String stuList(Model model){
        List<Student> students =studentService.queryAll();
        model.addAttribute("student",students);
        return  "stulist";
    }

    @RequestMapping("/toadd")
    public String toAdd(Model model){
        //查询所有班级
        List<Classes> classes = classesService.queryAll();
        model.addAttribute("classes", classes);

        return "stuadd";
    }


    @RequestMapping("/insert")
    public String insert(Student student){
        studentService.insertStudent(student);
        return "redirect:/stu/list";
    }

    @RequestMapping("/delete")
    public String delete(int sid){
        studentService.deleteStudent(sid);
        return "redirect:/stu/list";
    }
}
