package com.jx.dao;

import com.jx.bean.Role;
import com.jx.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by CHEN JX on 2017/11/6.
 */
@Repository
public interface UserDAO {

    void add(User user);

    User login(@Param("name")String name, @Param("password") String password);
    List<Role> getUserRole(@Param("id") int id);

    List<User> getAllUsers();
}
