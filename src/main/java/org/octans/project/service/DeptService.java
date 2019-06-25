package org.octans.project.service;

import org.octans.project.entity.entity.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 通过查询部门名称获取部门列表
     * @param name
     * @return
     */
    List<Dept> getDeptList(String name,int offset, int page_size);

    /**
     * 通过查询部门名称获取部门总数
     * @param name
     * @return
     */
    int getDeptListCount(String name);

    /**
     * 添加部门
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 编辑部门
     * @param dept
     * @return
     */
    boolean editDept(Dept dept);

    /**
     * 获取部门信息
     * @param id
     * @return
     */
    Dept getDept(Integer id);

    /**
     * 删除部门
     * @param ids
     * @return
     */
    boolean deleteDept(Integer[] ids);
}
