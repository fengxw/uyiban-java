package com.uyiban.leave.service;

import com.uyiban.leave.model.SmsLogModel;
import org.springframework.stereotype.Service;

@Service
public interface SmsLogService {

	public SmsLogModel SmsByMobileAndType(int id);
}
