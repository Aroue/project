package org.octans.project.dao;

import org.octans.project.entity.dto.employee.EmployeeA01DTO;
import org.octans.project.entity.entity.Employee;

import java.util.HashMap;
import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<EmployeeA01DTO> selectByQuery(HashMap<String, Object> params);
}