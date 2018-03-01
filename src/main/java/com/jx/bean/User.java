package com.jx.bean;

import java.util.List;
import java.util.Set;

/**
 * Created by CHEN JX on 2017/11/6.
 */
public class User {
    private String name;
    private String password;

    private String realName;
    private int sex;



    /**
     * 一个用户有多个角色
     */
    private Set<Role> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
