package com.xxl.job.admin.core.model;

import java.util.Date;

public class XxlJobHandler {
    // 主键
    private int id;
    // Handler名称
    private String handlerName;
    // Handler描述
    private String handlerDesc;
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

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public String getHandlerDesc() {
        return handlerDesc;
    }

    public void setHandlerDesc(String handlerDesc) {
        this.handlerDesc = handlerDesc;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
                ", handlerName='" + handlerName + '\'' +
                ", handlerDesc='" + handlerDesc + '\'' +
                ", jobGroupId=" + jobGroupId +
                ", jobGroupName='" + jobGroupName + '\'' +
                ", status=" + status +
                ", creteTime=" + creteTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
