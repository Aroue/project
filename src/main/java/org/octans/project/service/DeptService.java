package org.octans.project.service;

import org.octans.project.entity.entity.Dept;

import java.util.List;

public interface DeptService {
    // 通过查询部门名称获取部门列表
    List<Dept> getDeptList(String name);

    // 添加部门
    boolean addDept(Dept dept);

    // 编辑部门
    boolean editDept(Dept dept);

    // 获取部门信息
    Dept getDept(Integer id);

    // 删除部门
    boolean deleteDept(Integer id);
}
