package com.hcx.cache.service;

import com.hcx.cache.bean.Department;
import com.hcx.cache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @ClassName DepartmentService
 * @Description TODO 部门业务逻辑类，缓存redis
 * @Author 贺楚翔
 * @Date 2020-01-22 10:00
 * @Version 1.0
 **/
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Cacheable(cacheNames = "dept",cacheManager = "deptcacheManager")
    public Department getDept(int id){
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }
}
