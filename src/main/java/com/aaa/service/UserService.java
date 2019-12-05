package com.aaa.service;

import com.aaa.model.PermInfo;
import com.aaa.model.RoleInfo;
import com.aaa.model.User;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/8 20:01
 * @Version     : 1.0
 */
public interface UserService {
    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return com.aaa.model.User
     * @Author: cat
     * @Date: 2019/11/8
     */
    User getUserByUserName(String userName);
    /** 
    * 根据用户名获取对应角色信息 
    * @param userName
    * @return java.util.List<com.aaa.model.RoleInfo> 
    * @Author: cat
    * @Date: 2019/11/9 
    */
    List<RoleInfo> getRolesByUsername(String userName);
    /** 
    * 根据用户名获取对应角色信息所对应的权限信息  
    * @param userName
    * @return java.util.List<com.aaa.model.PermInfo> 
    * @Author: cat
    * @Date: 2019/11/9 
    */
    List<PermInfo> getPermByUserName(String userName);
    /**
    * 添加用户
    * @param user
    * @return void
    * @Author: cat
    * @Date: 2019/11/9
    */
    void addUser(User user);
}
