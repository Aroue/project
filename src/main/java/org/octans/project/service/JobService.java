package org.octans.project.service;

import org.octans.project.entity.entity.Job;

import java.util.List;

public interface JobService {
    // 通过查询职位名称获取职位列表
    List<Job> getJobList(String name);

    // 添加职位
    boolean addJob(Job job);

    // 编辑职位
    boolean editJob(Job job);

    // 获取职位信息
    Job getJob(Integer id);

    // 删除职位
    boolean deleteJob(Integer id);
}
