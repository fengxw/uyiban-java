package com.uyiban.leave.model;

import lombok.Data;

@Data
public class WorkflowModel {
    private String Id  ;
    private String UniversityId;
    private String AppServiceId;
    private String WFName     ;
    private String FormJson ;
    private String ProcessConfig;
    private String AppEvent    ;
    private int State;
    private int ApproveTips;
    private int RuleViewState;
    private int CreateTime    ;
    private int UpdateTime;
}
