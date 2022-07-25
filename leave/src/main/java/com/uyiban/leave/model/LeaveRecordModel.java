package com.uyiban.leave.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("leave_record")
public class LeaveRecordModel implements Serializable {
    @TableId
    private String Id  ;
    private String UniversityId;
    private String StudentId;
    private int StartTime;
    private int EndTime;
    private int OffLeaveTime;
    private int RealEndTime;
}
