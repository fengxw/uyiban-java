package com.test.uyiban.freshman.model;

import java.util.Arrays;

public class NoticeModel {
    private String UniversityId;
    private String BatchId;
    private int EducationLevel;
    private String Content;
    private String Attachments;
    private int CreatedAt;
    private int UpdatedAt;

    public String getUniversityId() {
        return UniversityId;
    }

    public void setUniversityId(String universityId) {
        this.UniversityId = universityId;
    }

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String batchId) {
        this.BatchId = batchId;
    }

    public int getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(int educationLevel) {
        this.EducationLevel = educationLevel;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public String getAttachments() {
        return Attachments;
    }

    public void setAttachments(String[] attachments) {
        this.Attachments = Arrays.toString(attachments);
    }

    public int getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(int createdAt) {
        this.CreatedAt = createdAt;
    }

    public int getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.UpdatedAt = updatedAt;
    }
}
