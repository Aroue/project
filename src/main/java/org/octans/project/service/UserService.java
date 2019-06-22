package org.octans.project.service;

import org.octans.project.entity.entity.User;

import java.util.List;

public interface UserService {
    // 获取全部用户（根据条件查询用户）
    List<User> getAllUser(String loginName, Integer status);

    // 添加用户
    boolean addUser(User user);

    // 编辑用户
    boolean updateUser(User user);

    // 获取用户信息
    User getUser(Integer id);


    // 删除用户
    boolean deleteUser(Integer id);


}
