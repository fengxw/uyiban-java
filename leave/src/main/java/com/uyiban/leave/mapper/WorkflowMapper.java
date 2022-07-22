package com.uyiban.leave.mapper;

import com.uyiban.leave.model.WorkflowModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkflowMapper {
    WorkflowModel findWF(String Id);
}
