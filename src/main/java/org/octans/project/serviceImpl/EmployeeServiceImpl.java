package org.octans.project.serviceImpl;

import org.octans.project.dao.EmployeeMapper;
import org.octans.project.entity.dto.employee.EmployeeA01DTO;
import org.octans.project.entity.entity.Employee;
import org.octans.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<EmployeeA01DTO> selectAll(HashMap<String, Object> params) {
        return employeeMapper.selectByQuery(params);
    }

    @Override
    public int selectAllCount(HashMap<String, Object> params) {
        return employeeMapper.selectByQueryCount(params);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeeMapper.insert(employee) > 0;
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteEmployee(Integer[] id) {
        return employeeMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return employeeMapper.updateByPrimaryKeySelective(employee) > 0;
    }
}
