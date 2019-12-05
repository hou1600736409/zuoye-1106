package com.aaa.service.impl;

import com.aaa.mapper.UserMapper;
import com.aaa.model.PermInfo;
import com.aaa.model.RoleInfo;
import com.aaa.model.User;
import com.aaa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/8 20:02
 * @Version     : 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    public static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByUserName(String userName) {
        User user = userMapper.getUserByUserName(userName);
        if (user == null){
            logger.warn("user is null");
            return null;
        }
        return user;
    }

    @Override
    public List<RoleInfo> getRolesByUsername(String userName) {
        List<RoleInfo> roleInfoList = userMapper.getRolesByUsername(userName);
        if (roleInfoList == null || roleInfoList.isEmpty()){
            logger.warn("roleInfoList  is null");
            return null;
        }
        return roleInfoList;
    }

    @Override
    public List<PermInfo> getPermByUserName(String userName) {
        List<PermInfo> permInfos = userMapper.getPermByUserName(userName);
        if (permInfos == null || permInfos.isEmpty()){
            logger.warn("permInfos  is null");
            return null;
        }
        return permInfos;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
