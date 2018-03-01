package com.jx.bean;

import java.util.List;
import java.util.Set;

/**
 * Created by CHEN JX on 2017/11/18.
 */
public class Role {
    private int id;
    private String name;

    private Set<User> users;//一个角色有多个用户

    private Set<Permission> permissions;//一个角色有多个权限

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


