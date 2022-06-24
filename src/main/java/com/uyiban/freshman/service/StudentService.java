package com.uyiban.freshman.service;

import com.uyiban.freshman.mapper.StudentMapper;
import com.uyiban.freshman.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    public StudentModel getStudentById(int id);
}
