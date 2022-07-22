package com.uyiban.freshman.service;

import com.uyiban.freshman.model.StudentModel;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    public StudentModel getStudentById(int id);
}
