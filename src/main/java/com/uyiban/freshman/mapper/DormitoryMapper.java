package com.uyiban.freshman.mapper;

import com.uyiban.freshman.model.DormitoryModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DormitoryMapper {
    DormitoryModel getDormitoryById(int id);

    List<DormitoryModel> getAll();
}
