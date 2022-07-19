package com.uyiban.leave.mapper;

import com.uyiban.leave.model.SmsLogModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsLogMapper {
	SmsLogModel SmsByMobileAndType(int id);
}
