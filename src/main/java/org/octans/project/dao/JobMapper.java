package org.octans.project.dao;

import org.apache.ibatis.annotations.Param;
import org.octans.project.entity.entity.Job;

import java.util.List;

public interface JobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> selectByQuery(@Param("name")String name);
}