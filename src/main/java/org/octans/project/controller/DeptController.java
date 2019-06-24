package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.dto.dept.DeptA01InputDTO;
import org.octans.project.entity.dto.dept.DeptA02InputDTO;
import org.octans.project.entity.dto.dept.DeptA03InputDTO;
import org.octans.project.entity.dto.dept.DeptA04InputDTO;
import org.octans.project.entity.entity.Dept;
import org.octans.project.service.DeptService;
import org.octans.project.util.BeanMapper;
import org.octans.project.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "deptController | 部门相关API")
@RequestMapping("/dept")
public class DeptController {
    private final DeptService deptService;

    @Autowired
    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }


    @ApiOperation(value = "获取部门列表", notes = "获取部门列表（可根据部门名称搜索）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid DeptA01InputDTO input){
        JSONResult<List<Dept>> jsonResult = new JSONResult<>();
        List<Dept> deptList = BeanMapper.mapList(deptService.getDeptList(input.getName()),Dept.class);
        // 设置返回数据
        jsonResult.setData(deptList);
        return jsonResult;
    }

    @ApiOperation(value = "添加部门", notes = "添加部门", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody DeptA02InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Dept dept = BeanMapper.map(input,Dept.class);
        boolean success = deptService.addDept(dept);

        jsonResult.setMessage(success ? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "编辑部门", notes = "编辑部门", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody DeptA03InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Dept dept = BeanMapper.map(input,Dept.class);
        boolean success = deptService.editDept(dept);

        jsonResult.setMessage(success ? "编辑成功" : "编辑失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取部门信息", notes = "获取部门详情信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody DeptA04InputDTO input){
        JSONResult<Dept> jsonResult = new JSONResult<>();

        Dept dept = deptService.getDept(input.getId());
        jsonResult.setData(dept);
        return jsonResult;
    }

    @ApiOperation(value = "删除部门", notes = "删除部门", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody DeptA04InputDTO input){
        JSONResult<Dept> jsonResult = new JSONResult<>();

        boolean success = deptService.deleteDept(input.getId());
        jsonResult.setMessage(success ? "删除成功" :  "删除失败");
        return jsonResult;
    }


}
