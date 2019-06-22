package org.octans.project.serviceImpl;

import org.octans.project.dao.UserMapper;
import org.octans.project.entity.entity.User;
import org.octans.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getAllUser(String loginName, Integer status) {
        return userMapper.selectAll(loginName,status);
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateByPrimaryKey(user) > 0;
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


    @Override
    public boolean deleteUser(Integer id) {
        return userMapper.deleteByPrimaryKey(id) > 0;
    }
}
