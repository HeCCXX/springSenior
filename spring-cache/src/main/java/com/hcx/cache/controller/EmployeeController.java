package com.hcx.cache.controller;

import com.hcx.cache.bean.Employee;
import com.hcx.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EmployeeController
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-01-20 13:46
 * @Version 1.0
 **/
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") int id){
        Employee emp = employeeService.getEmp(id);
        return emp;
    }
}
