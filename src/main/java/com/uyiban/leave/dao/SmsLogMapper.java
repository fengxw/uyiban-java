/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.uyiban.leave.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uyiban.leave.model.SmsLog;
import org.apache.ibatis.annotations.Param;

public interface SmsLogMapper extends BaseMapper<SmsLog> {

	void invalidSmsByMobileAndType(@Param("mobile") String mobile, @Param("type") Integer type);
}
