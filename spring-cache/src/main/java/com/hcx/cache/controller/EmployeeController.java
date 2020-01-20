package com.hcx.cache.controller;

import com.hcx.cache.bean.Employee;
import com.hcx.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        Employee employee1 = employeeService.updateEmp(employee);
        return employee1;
    }

    @GetMapping("/deleteemp")
    public void deleteEmp(int id){
        employeeService.deleteEmp(id);
    }

    @GetMapping("/emp/lastname/{lastName}")
    public Employee getEmpByLastName(@PathVariable("lastName") String lastName){
        Employee emp = employeeService.getEmpByLastName(lastName);
        return emp;
    }
}
