package com.xxl.job.admin.core.model;

import java.util.Date;

public class XxlJobHandler {
    // 主键
    private int id;
    // Handler名称
    private String jobHandlerName;
    // Handler描述
    private String jobHandlerDesc;
    // 执行器主键
    private int jobGroupId;
    // 执行器名
    private String jobGroupName;
    // 创建时间
    private Date creteTime;
    // 更新时间
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobHandlerName() {
        return jobHandlerName;
    }

    public void setJobHandlerName(String jobHandlerName) {
        this.jobHandlerName = jobHandlerName;
    }

    public String getJobHandlerDesc() {
        return jobHandlerDesc;
    }

    public void setHandlerDesc(String jobHandlerDesc) {
        this.jobHandlerDesc = jobHandlerDesc;
    }

    public int getJobGroupId() {
        return jobGroupId;
    }

    public void setJobGroupId(int jobGroupId) {
        this.jobGroupId = jobGroupId;
    }

    public String getJobGroupName() {
        return jobGroupName;
    }

    public void setJobGroupName(String jobGroupName) {
        this.jobGroupName = jobGroupName;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "XxlJobHandler{" +
                "id=" + id +
                ", jobHandlerName='" + jobHandlerName + '\'' +
                ", jobHandlerDesc='" + jobHandlerDesc + '\'' +
                ", jobGroupId=" + jobGroupId +
                ", jobGroupName='" + jobGroupName + '\'' +
                ", creteTime=" + creteTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
