package com.jx.service;

import com.jx.bean.Role;
import com.jx.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by CHEN JX on 2017/11/6.
 */
public interface UserService {

    void add(User user);

    List<Role> getUserRole(int id);//根据用户id查找拥有的角色

    User login(String name,String password);

    List<User> getAllUsers();
}
