package com.xxl.job.admin.controller;

import com.xxl.job.admin.dao.XxlJobHandlerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jonHandler")
public class JobHandlerController {
    @Autowired
    private XxlJobHandlerDao xxlJobHandlerDao;
}
