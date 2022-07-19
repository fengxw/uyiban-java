package com.uyiban.leave.controller;

import com.uyiban.leave.model.StudentModel;
import com.uyiban.leave.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public StudentModel getStudentById(@RequestParam("id") int id) {
        System.out.println(id);
        return studentService.getStudentById(id);
    }
}
