package org.octans.project.serviceImpl;

import org.octans.project.dao.UserMapper;
import org.octans.project.entity.entity.User;
import org.octans.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
