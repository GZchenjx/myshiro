package com.jx.bean;

/**
 * Created by CHEN JX on 2017/11/18.
 */
public class Permission {

    private int id;
    private String permission;

    private Role role;//一个权限对应一个角色

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
