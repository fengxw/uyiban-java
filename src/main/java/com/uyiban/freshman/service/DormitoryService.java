package com.uyiban.freshman.service;

import com.uyiban.freshman.model.DormitoryModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DormitoryService {

    DormitoryModel getDormitoryById(int id);

    List<DormitoryModel> getDormitories(int offset, int limit);
}
