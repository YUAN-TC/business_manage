package com.neuedu.service.impl;

import com.neuedu.dao.UserInfoMapper;
import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService{


    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public UserInfo login(UserInfo userInfo) throws MyException {
        if(userInfo==null||userInfo.getUsername().equals("")) {
            throw new MyException("参数不能为空");
        }
       UserInfo userInfo1= userInfoMapper.selectByName(userInfo.getUsername());
       if(userInfo1==null){
           throw new MyException("用户不存在");
       }
        System.out.println(userInfo1.getPassword());
        System.out.println(userInfo.getPassword());
       if(!userInfo.getPassword().equals(userInfo1.getPassword())){
           throw new MyException("密码错误");
       }
        return  userInfo1;
    }

    @Override
    public int clogin(UserInfo userInfo)  {
        if(userInfo==null) {
            return 0;
        }
        UserInfo userInfo1= userInfoMapper.selectByName(userInfo.getUsername());
        if(userInfo1==null){
            return 0;
        }
        if(!userInfo.getPassword().equals(userInfo1.getPassword())){
            return 0;
        }
        return  1;
    }

    @Override
    public int addUser(UserInfo userInfo) {
      int count =userInfoMapper.insert(userInfo);
      return count;

    }

    @Override
    public int deleteUser(int id) {
       userInfoMapper.deleteByPrimaryKey(id);
       return 0;
    }

    @Override
    public int updataUser(UserInfo userInfo) {
        int count=userInfoMapper.updateByPrimaryKey(userInfo);
        return count;
    }

    @Override
    public List<UserInfo> findAllUser() {
        List<UserInfo>userInfos=userInfoMapper.selectAll();
        return userInfos;
    }

    @Override
    public UserInfo findUserByName(String name) {
       UserInfo userInfo=userInfoMapper.selectByName(name);
       return userInfo;
    }




}
