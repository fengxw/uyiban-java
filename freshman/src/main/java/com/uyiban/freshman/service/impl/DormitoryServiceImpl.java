package com.uyiban.freshman.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uyiban.freshman.mapper.DormitoryMapper;
import com.uyiban.freshman.model.DormitoryModel;
import com.uyiban.freshman.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    DormitoryMapper dormitoryMapper;

    public DormitoryModel getDormitoryById(int id) {
        return dormitoryMapper.getDormitoryById(id);
    };

    public PageInfo<DormitoryModel> getDormitories(int page, int pageSize, String number) {
        PageHelper.startPage(page, pageSize);
        List<DormitoryModel> dormitories=dormitoryMapper.getAll(number);
        PageInfo<DormitoryModel> pageInfo = new PageInfo<>(dormitories);

        return pageInfo;
    };

    @Transactional(rollbackFor = Exception.class)
    public void updateStudentNoById(int id, String studentNo) {
        System.out.println(studentNo);
        dormitoryMapper.updateStudentNoById(id, studentNo);
    }
}
