package org.octans.project.dao;

import org.apache.ibatis.annotations.Param;
import org.octans.project.entity.entity.Dept;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer[] id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> selectByQuery(@Param("name")String name, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    int selectByQueryCount(@Param("name")String name);
}