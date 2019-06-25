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
    public List<User> getAllUser(String loginName, Integer status,  int page, int pageSize) {
        return userMapper.selectAll(loginName,status,(page - 1) * pageSize, pageSize);
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
    public boolean deleteUser(Integer[] ids) {
        return userMapper.deleteByPrimaryKey(ids) > 0;
    }

    @Override
    public User userLogin(String userName, String password) {
        return userMapper.userLogin(userName,password);
    }

    @Override
    public User userExist(String loginName) {
        return userMapper.userExist(loginName) ;
    }

    @Override
    public int countDataCount(String loginName, Integer status) {
        return userMapper.selectAllCount(loginName,status);
    }
}
