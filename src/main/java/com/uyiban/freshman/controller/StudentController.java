package com.uyiban.freshman.controller;

import com.uyiban.freshman.model.StudentModel;
import com.uyiban.freshman.service.StudentService;
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
