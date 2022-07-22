package com.uyiban.leave.service;

import com.uyiban.leave.model.WorkflowModel;
import org.springframework.stereotype.Service;

@Service
public interface WorkflowService {

    public WorkflowModel findWF(String Id);
}
