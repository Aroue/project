package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.entity.User;
import org.octans.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("用户API")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @ApiOperation(value = "用户获取", notes = "用户获取（用户条数）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public User getAll(Integer id){
        return userService.getUser(id);
    }
}
