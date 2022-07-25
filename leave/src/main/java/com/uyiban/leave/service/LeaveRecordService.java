package com.uyiban.leave.service;

import com.uyiban.leave.model.LeaveRecordModel;
import org.springframework.stereotype.Service;

@Service
public interface LeaveRecordService {

    public LeaveRecordModel findById(String Id);
    public LeaveRecordModel findOneById(String Id);
}
