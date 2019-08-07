package com.neuedu.service;

import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;
import com.neuedu.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {



    public UserInfo login(UserInfo userInfo) throws MyException;
    public int clogin(UserInfo userInfo) ;

    public int addUser(UserInfo userInfo);

    public int deleteUser(int id);

    public int updataUser(UserInfo userInfo);

    public List<UserInfo> findAllUser();

    public  UserInfo findUserByName(String name);

}
