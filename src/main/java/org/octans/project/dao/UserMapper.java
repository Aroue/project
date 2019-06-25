package org.octans.project.dao;

import org.apache.ibatis.annotations.Param;
import org.octans.project.entity.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer[] id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll(@Param("loginName")String loginName, @Param("status")Integer status, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    User userLogin(@Param("loginName") String userName, @Param("password") String password);

    User userExist(@Param("loginName") String userName);

    int selectAllCount(@Param("loginName")String loginName, @Param("status")Integer status);

}