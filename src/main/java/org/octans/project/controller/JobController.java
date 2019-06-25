package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.dto.deleteInputDTO;
import org.octans.project.entity.dto.job.JobA01InputDTO;
import org.octans.project.entity.dto.job.JobA02InputDTO;
import org.octans.project.entity.dto.job.JobA03InputDTO;
import org.octans.project.entity.dto.job.JobA04InputDTO;
import org.octans.project.entity.entity.Job;
import org.octans.project.service.JobService;
import org.octans.project.util.BeanMapper;
import org.octans.project.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "jobController | 职位相关API")
@RequestMapping("/job")
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }


    @ApiOperation(value = "获取职位列表", notes = "获取职位列表（可根据职位名称搜索）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid JobA01InputDTO input){
        JSONResult<List<Job>> jsonResult = new JSONResult<>();
        if (input.getPage() == null || input.getPageSize() == null) {
            input.setPage(1);
            input.setPageSize(20);
        }
        List<Job> jobList = BeanMapper.mapList(jobService.getJobList(input.getName(),input.getPage(),input.getPageSize()),Job.class);
        // 数据返回值
        jsonResult.setTotalCount(jobService.getJobListCount(input.getName()));
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setData(jobList);
        return jsonResult;
    }

    @ApiOperation(value = "添加职位", notes = "添加职位", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody JobA02InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Job job = BeanMapper.map(input,Job.class);
        boolean success = jobService.addJob(job);

        jsonResult.setMessage(success ? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "编辑职位", notes = "编辑职位", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody JobA03InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Job job = BeanMapper.map(input,Job.class);
        boolean success = jobService.editJob(job);

        jsonResult.setMessage(success ? "编辑成功" : "编辑失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取职位信息", notes = "获取职位详情信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody JobA04InputDTO input){
        JSONResult<Job> jsonResult = new JSONResult<>();

        Job job = jobService.getJob(input.getId());
        jsonResult.setData(job);
        return jsonResult;
    }

    @ApiOperation(value = "删除职位", notes = "删除职位", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody deleteInputDTO input){
        JSONResult<Job> jsonResult = new JSONResult<>();

        boolean success = jobService.deleteJob(input.getIds());
        jsonResult.setMessage(success ? "删除成功" :  "删除失败");
        return jsonResult;
    }

}
