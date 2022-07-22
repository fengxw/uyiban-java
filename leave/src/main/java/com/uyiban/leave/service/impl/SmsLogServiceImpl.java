package com.uyiban.leave.service.impl;

import com.uyiban.leave.mapper.SmsLogMapper;
import com.uyiban.leave.model.SmsLogModel;
import com.uyiban.leave.service.SmsLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsLogServiceImpl implements SmsLogService {

    @Autowired
    SmsLogMapper smsLogMapper;

    @Override
    public SmsLogModel SmsByMobileAndType(int id) {
        return smsLogMapper.SmsByMobileAndType(id);
    }
}
