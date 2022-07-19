package com.uyiban.leave.service.impl;

import com.uyiban.leave.mapper.StudentMapper;
import com.uyiban.leave.model.StudentModel;
import com.uyiban.leave.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    public StudentModel getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }
}
