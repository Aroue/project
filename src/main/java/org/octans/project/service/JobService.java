package org.octans.project.service;

import org.octans.project.entity.entity.Job;

import java.util.List;

public interface JobService {
    /**
     * 通过查询职位名称获取职位列表
     * @param name
     * @return
     */
    List<Job> getJobList(String name);

    /**
     * 添加职位
     * @param job
     * @return
     */
    boolean addJob(Job job);

    /**
     * 编辑职位
     * @param job
     * @return
     */
    boolean editJob(Job job);

    /**
     * 获取职位信息
     * @param id
     * @return
     */
    Job getJob(Integer id);

    /**
     * 删除职位
     * @param id
     * @return
     */
    boolean deleteJob(Integer id);
}
