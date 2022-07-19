package com.uyiban.leave.service;

import com.uyiban.leave.model.StudentModel;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    public StudentModel getStudentById(int id);
}
