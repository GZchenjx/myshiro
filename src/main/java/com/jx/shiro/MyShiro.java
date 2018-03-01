package com.jx.shiro;

import com.jx.bean.Permission;
import com.jx.bean.Role;
import com.jx.bean.User;
import com.jx.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by CHEN JX on 2017/11/18.
 */
@Service
@Transactional
public class MyShiro extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 授权认证
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Integer userId = (Integer) principalCollection.fromRealm(getName()).iterator().next();
        //根据用户id查找拥有的角色
        List<Role> userRole = userService.getUserRole(userId);
        if (userRole != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            for (Role role : userRole) {
                info.addRole(role.getName());
            }
            return info;
        } else {
            return null;
        }
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
