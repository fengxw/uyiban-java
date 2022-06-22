package com.uyiban.freshman.mapper;

import com.uyiban.freshman.model.StudentModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    StudentModel getStudentById(int id);
}
