package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobHandler;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface XxlJobHandlerDao {
    public List<XxlJobHandler> pageList(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize, @Param("JonHandler") String jobGroupId);

    public int save(XxlJobHandler jobHandler);

    public int deleteById(@Param("id") int id);
}
