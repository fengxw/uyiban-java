package com.uyiban.freshman.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uyiban.freshman.mapper.DormitoryMapper;
import com.uyiban.freshman.model.DormitoryModel;
import com.uyiban.freshman.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    DormitoryMapper dormitoryMapper;

    public DormitoryModel getDormitoryById(int id) {
        return dormitoryMapper.getDormitoryById(id);
    };

    public PageInfo<DormitoryModel> getDormitories(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<DormitoryModel> dormitories=dormitoryMapper.getAll();
        PageInfo<DormitoryModel> pageInfo = new PageInfo<>(dormitories);

        return pageInfo;
    };
}
