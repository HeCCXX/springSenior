package com.hcx.cache.mapper;

import com.hcx.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName DepartmentMapper
 * @Description TODO 部门 mybatis 数据层类
 * @Author 贺楚翔
 * @Date 2020-01-20 13:41
 * @Version 1.0
 **/
@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM DEPARTMENT WHERE ID=#{id}")
    public Department getDeptById(int id);
}
