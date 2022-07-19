package com.uyiban.leave.mapper;

import com.uyiban.leave.model.DormitoryModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DormitoryMapper {
    DormitoryModel getDormitoryById(int id);

    List<DormitoryModel> getAll();
}
