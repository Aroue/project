package org.octans.project.serviceImpl;

import org.octans.project.dao.JobMapper;
import org.octans.project.entity.entity.Job;
import org.octans.project.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class JobServiceImpl implements JobService {
    private final JobMapper jobMapper;

    @Autowired
    public JobServiceImpl(JobMapper jobMapper) {
        this.jobMapper = jobMapper;
    }

    @Override
    public List<Job> getJobList(String name) {
        return jobMapper.selectByQuery(name);
    }

    @Override
    public boolean addJob(Job job) {
        return jobMapper.insert(job) > 0;
    }

    @Override
    public boolean editJob(Job job) {
        return jobMapper.updateByPrimaryKey(job) > 0;
    }

    @Override
    public Job getJob(Integer id) {
        return jobMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteJob(Integer id) {
        return jobMapper.deleteByPrimaryKey(id) > 0;
    }
}
