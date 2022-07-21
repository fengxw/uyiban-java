package com.uyiban.freshman.service;

import com.github.pagehelper.PageInfo;
import com.uyiban.freshman.model.DormitoryModel;
import org.springframework.stereotype.Service;

@Service
public interface DormitoryService {

    DormitoryModel getDormitoryById(int id);

    PageInfo<DormitoryModel> getDormitories(int offset, int limit, String number);
}
