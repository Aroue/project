package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.dto.user.*;
import org.octans.project.entity.entity.User;
import org.octans.project.service.UserService;
import org.octans.project.util.BeanMapper;
import org.octans.project.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "userController | 用户相关API")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @ApiOperation(value = "获取全部用户", notes = "获取全部用户（可根据条件筛选）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A01")
    public JSONResult A01(@Valid @RequestBody UserA01InputDTO input){
        JSONResult<List<UserDTO>> jsonResult = new JSONResult<>();
        List<UserDTO> userDTOList = BeanMapper.mapList(userService.getAllUser(input.getLoginName(),input.getStatus()),UserDTO.class);
        // 设置返回数据
        jsonResult.setData(userDTOList);
        return jsonResult;
    }

    @ApiOperation(value = "添加用户", notes = "添加用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody UserA02InputDTO input){
        JSONResult jsonResult = new JSONResult<>();
        User user = BeanMapper.map(input, User.class);
        boolean success = userService.addUser(user);
        jsonResult.setMessage(success ? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取用户", notes = "获取用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody UserA03InputDTO input){
        JSONResult<UserDTO> jsonResult = new JSONResult<>();
        UserDTO userDTO = BeanMapper.map(userService.getUser(input.getId()),UserDTO.class);
        jsonResult.setData(userDTO);
        return jsonResult;
    }

    @ApiOperation(value = "编辑用户", notes = "编辑用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody UserA04InputDTO input){
        JSONResult jsonResult = new JSONResult<>();
        User user = BeanMapper.map(input, User.class);
        boolean success = userService.updateUser(user);
        jsonResult.setMessage(success  ? "编辑成功" : "编辑失败");
        return jsonResult;
    }


    @ApiOperation(value = "删除用户", notes = "删除用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody UserA03InputDTO input){
        JSONResult jsonResult = new JSONResult<>();
        boolean success = userService.deleteUser(input.getId());
        jsonResult.setMessage(success  ? "删除成功" : "删除失败");
        return jsonResult;
    }
}
