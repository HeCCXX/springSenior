package com.hcx.cache.controller;

import com.hcx.cache.bean.Department;
import com.hcx.cache.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DepartmentController
 * @Description TODO 部门前台访问类
 * @Author 贺楚翔
 * @Date 2020-01-22 10:07
 * @Version 1.0
 **/
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") int id ){
        Department dept = departmentService.getDept(id);
        return dept;
    }
}
