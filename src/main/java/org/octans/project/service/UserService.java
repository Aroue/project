package org.octans.project.service;

import org.octans.project.entity.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 获取全部用户（根据条件查询用户）
     * @param loginName
     * @param status
     * @return
     */
    List<User> getAllUser(String loginName, Integer status, int offset, int page_size);

    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 编辑用户
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    User getUser(Integer id);


    /**
     * 删除用户
     * @param ids
     * @return
     */
    boolean deleteUser(Integer[] ids);


    /**
     * 用户登陆
     * @param userName
     * @param password
     * @return
     */
    User userLogin(String userName, String password);


    /**
     * 判断用户是否存在
     * @param loginName
     * @return
     */
    User userExist(String loginName);

    /**
     * 获取用户总数
     * @return
     */
    int countDataCount(String loginName, Integer status);


}
