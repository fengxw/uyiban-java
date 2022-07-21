package com.uyiban.leave.service.impl;

import com.uyiban.leave.mapper.WorkflowMapper;
import com.uyiban.leave.model.WorkflowModel;
import com.uyiban.leave.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowServiceImpl implements WorkflowService {

    @Autowired
    WorkflowMapper workflowMapper;

    public WorkflowModel findWF(String Id) {
        return workflowMapper.findWF(Id);
    }
}
