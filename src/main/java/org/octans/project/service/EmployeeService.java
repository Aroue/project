package org.octans.project.service;

import org.octans.project.entity.dto.employee.EmployeeA01DTO;
import org.octans.project.entity.entity.Employee;

import java.util.HashMap;
import java.util.List;

public interface EmployeeService {
    // 根据条件筛选出符合条件的全部员工
    List<EmployeeA01DTO> selectAll(HashMap<String, Object> params);

    // 添加员工
    boolean addEmployee(Employee employee);

    // 获取员工详细信息
    Employee getEmployee(Integer id);

    // 删除员工
    boolean deleteEmployee(Integer id);

    // 编辑员工信息
    boolean editEmployee(Employee employee);
}
