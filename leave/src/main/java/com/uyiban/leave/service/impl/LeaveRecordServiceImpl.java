package com.uyiban.leave.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.uyiban.leave.mapper.LeaveRecordMapper;
import com.uyiban.leave.model.LeaveRecordModel;
import com.uyiban.leave.service.LeaveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveRecordServiceImpl implements LeaveRecordService {

    @Autowired
    LeaveRecordMapper leaveRecordMapper;

    public LeaveRecordModel findOneById(String Id) {
        return leaveRecordMapper.selectOne(new LambdaQueryWrapper<LeaveRecordModel>().eq(LeaveRecordModel::getId, Id));
    }
    public LeaveRecordModel findById(String Id) {
        return leaveRecordMapper.findById(Id);
    }
}
