package com.uyiban.leave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uyiban.leave.model.LeaveRecordModel;
import org.springframework.stereotype.Service;

@Service
public interface LeaveRecordService extends IService<LeaveRecordModel> {

    public LeaveRecordModel findById(String Id);
    public LeaveRecordModel findOneById(String Id);
}
