/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.uyiban.leave.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uyiban.leave.model.User;
import com.uyiban.leave.param.UserRegisterParam;

/**
 *
 * @author lgh on 2018/09/11.
 */
public interface UserService extends IService<User> {

    User getUserByUserId(String userId);

    void validate(UserRegisterParam userRegisterParam, String checkRegisterSmsFlag);
}
