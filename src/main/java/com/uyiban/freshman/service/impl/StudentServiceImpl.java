package com.uyiban.freshman.service.impl;

import com.uyiban.freshman.mapper.StudentMapper;
import com.uyiban.freshman.model.StudentModel;
import com.uyiban.freshman.service.StudentService;
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
