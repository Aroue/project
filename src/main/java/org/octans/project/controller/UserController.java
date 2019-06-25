package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.dto.deleteInputDTO;
import org.octans.project.entity.dto.user.*;
import org.octans.project.entity.entity.User;
import org.octans.project.service.UserService;
import org.octans.project.util.BeanMapper;
import org.octans.project.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
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
        List<UserDTO> userDTOList = BeanMapper.mapList(userService.getAllUser(input.getLoginName(),input.getStatus(),input.getPage(),input.getPageSize()),UserDTO.class);

        // 数据返回值
        jsonResult.setTotalCount(userService.countDataCount(input.getLoginName(),input.getStatus()));
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
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
    public JSONResult A05(@Valid @RequestBody deleteInputDTO input){
        JSONResult jsonResult = new JSONResult<>();
        boolean success = userService.deleteUser(input.getIds());
        jsonResult.setMessage(success  ? "删除成功" : "删除失败");
        return jsonResult;
    }

    @ApiOperation(value = "用户登陆", notes = "用户登陆", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A06")
    public JSONResult A06(@Valid @RequestBody UserA06InputDTO input) throws Exception {

        JSONResult<UserDTO> jsonResult = new JSONResult<>();
        User user = userService.userLogin(input.getLoginName(), input.getPassword());

        UserDTO userDTO = BeanMapper.map(user, UserDTO.class);

        if (user != null) {
            jsonResult.setData(userDTO);
        } else {
            throw new Exception("登陆失败");
        }
        return jsonResult;
    }

    @ApiOperation(value = "判断用户是否存在", notes = "判断用户是否存在", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A07")
    public JSONResult A07(@Valid @RequestBody UserA06InputDTO input) throws Exception {
        JSONResult<UserDTO> jsonResult = new JSONResult<>();
        UserDTO userDTO = BeanMapper.map(userService.userExist(input.getLoginName()), UserDTO.class);

        if (userDTO != null) {
            throw new Exception("改用户名已经存在");
        }
        return jsonResult;
    }

}
