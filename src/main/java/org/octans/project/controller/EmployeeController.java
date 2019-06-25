package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.dto.deleteInputDTO;
import org.octans.project.entity.dto.employee.*;
import org.octans.project.entity.entity.Employee;
import org.octans.project.service.EmployeeService;
import org.octans.project.util.BeanMapper;
import org.octans.project.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@RestController
@CrossOrigin
@Api(tags = "employeeController | 员工相关API")
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @ApiOperation(value = "获取员工列表", notes = "获取员工列表（可根据员工相关条件搜索）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A01")
    public JSONResult A01(@Valid @RequestBody EmployeeA01InputDTO input){
        JSONResult<List<EmployeeA01DTO>> jsonResult = new JSONResult<>();

        // 查询参数
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", input.getName());
        params.put("cardId",input.getCardId());
        params.put("deptId",input.getDeptId());
        params.put("jobId",input.getJobId());
        params.put("phone",input.getPhone());
        params.put("sex",input.getSex());
        params.put("offset",(input.getPage() - 1) * input.getPageSize());
        params.put("pageSize",input.getPageSize());
//        (page - 1) * pageSize, pageSize
        List<EmployeeA01DTO> employeeA01DTOList = employeeService.selectAll(params);

        // 数据返回值
        jsonResult.setTotalCount(employeeService.selectAllCount(params));
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setData(employeeA01DTOList);
        return jsonResult;
    }

    @ApiOperation(value = "添加员工", notes = "添加员工", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody EmployeeA02InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Employee employee = BeanMapper.map(input,Employee.class);
        boolean success = employeeService.addEmployee(employee);

        jsonResult.setMessage(success ? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取员工信息", notes = "获取员工详细信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody EmployeeA03InputDTO input){
        JSONResult<Employee> jsonResult = new JSONResult<>();

        Employee employee = employeeService.getEmployee(input.getId());

        jsonResult.setData(employee);
        return jsonResult;
    }

    @ApiOperation(value = "编辑员工信息", notes = "编辑员工详细信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody EmployeeA04InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Employee employee = BeanMapper.map(input,Employee.class);
        boolean success = employeeService.editEmployee(employee);

        jsonResult.setMessage(success ? "编辑成功" : "编辑失败");
        return jsonResult;
    }

    @ApiOperation(value = "删除员工", notes = "删除员工", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody deleteInputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        boolean success = employeeService.deleteEmployee(input.getIds());
        jsonResult.setMessage(success ? "删除成功" : "删除失败");
        return jsonResult;
    }
}
