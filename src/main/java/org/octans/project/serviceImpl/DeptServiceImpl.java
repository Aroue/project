package org.octans.project.serviceImpl;

import org.octans.project.dao.DeptMapper;
import org.octans.project.entity.entity.Dept;
import org.octans.project.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
@Transactional
public class DeptServiceImpl implements DeptService {
    private final DeptMapper deptMapper;

    @Autowired
    public DeptServiceImpl(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }


    @Override
    public List<Dept> getDeptList(String name) {
        return deptMapper.selectByQuery(name);
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.insert(dept) > 0;
    }

    @Override
    public boolean editDept(Dept dept) {
        return deptMapper.updateByPrimaryKey(dept) > 0;
    }

    @Override
    public Dept getDept(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteDept(Integer id) {
        return deptMapper.deleteByPrimaryKey(id) > 0;
    }
}
