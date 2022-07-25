package com.uyiban.leave.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uyiban.leave.model.LeaveRecordModel;
import com.uyiban.leave.model.WorkflowModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaveRecordMapper extends BaseMapper<LeaveRecordModel> {
     LeaveRecordModel findById(String Id);
}
