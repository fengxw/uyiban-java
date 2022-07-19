package com.uyiban.leave.mapper;

import com.uyiban.leave.model.StudentModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    StudentModel getStudentById(int id);
}
