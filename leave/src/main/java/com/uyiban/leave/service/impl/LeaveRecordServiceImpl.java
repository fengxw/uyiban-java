package com.uyiban.leave.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.uyiban.leave.mapper.LeaveRecordMapper;
import com.uyiban.leave.model.LeaveRecordModel;
import com.uyiban.leave.service.LeaveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveRecordServiceImpl extends ServiceImpl<LeaveRecordMapper, LeaveRecordModel>  implements LeaveRecordService {

    @Autowired
    LeaveRecordMapper leaveRecordMapper;


    public LeaveRecordModel findOneById(String Id) {
//        System.out.println(new LambdaQueryWrapper<LeaveRecordModel>().eq(LeaveRecordModel::getId, Id).getSqlSelect());
//        return leaveRecordMapper.selectOne(new LambdaQueryWrapper<LeaveRecordModel>().eq(LeaveRecordModel::getId, Id));
//        LambdaQueryWrapper<LeaveRecordModel> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(LeaveRecordModel::getId, Id);
//
//        System.out.println(wrapper.getSqlSelect());
//        List<LeaveRecordModel> leaveItems = leaveRecordMapper.selectList(wrapper);
        // 查询条件构造器
        QueryWrapper<LeaveRecordModel> wrapper = new QueryWrapper<>();
        wrapper.eq("Id", Id);
        // 查询操作
        List<LeaveRecordModel> bannerItems = leaveRecordMapper.selectList(wrapper);


        return leaveRecordMapper.findById(Id);

    }
    public LeaveRecordModel findById(String Id) {
        return leaveRecordMapper.findById(Id);
    }
}
