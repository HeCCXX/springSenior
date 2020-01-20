package com.hcx.cache.mapper;

import com.hcx.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @ClassName EmployeeMapper
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-01-20 13:40
 * @Version 1.0
 **/
@Mapper
public interface EmployeeMapper {

    @Select("select * from Employee where id = #{id}")
    public Employee getEmp(int id);

    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} WHERE id=#{id}")
    public void updateEmp(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void deleteEmpById(Integer id);

    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmployee(Employee employee);

    @Select("SELECT * FROM employee WHERE lastName = #{lastName}")
    Employee getEmpByLastName(String lastName);
}
