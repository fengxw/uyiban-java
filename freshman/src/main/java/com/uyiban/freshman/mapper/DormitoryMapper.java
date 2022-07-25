package com.uyiban.freshman.mapper;

import com.uyiban.freshman.model.DormitoryModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DormitoryMapper {
    DormitoryModel getDormitoryById(int id);

    List<DormitoryModel> getAll(String number);

    void updateStudentNoById(@Param("id") int id, @Param("studentNo") String studentNo);
}
