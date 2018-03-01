package com.jx.service.impl;

import com.jx.bean.Role;
import com.jx.bean.User;
import com.jx.dao.UserDAO;
import com.jx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CHEN JX on 2017/11/6.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public List<Role> getUserRole(int id) {
        return userDAO.getUserRole(id);
    }

    @Override
    public User login(String name, String password) {
        return userDAO.login(name,password);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
