package com.atguigu.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> getUserList() {
        //List<UserInfo> userInfos = userInfoMapper.selectUserList();
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }
}
