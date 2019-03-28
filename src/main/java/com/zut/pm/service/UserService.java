package com.zut.pm.service;

import com.zut.pm.dao.UserDao;
import com.zut.pm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.logging.Logger;

@Service
public class UserService {
    @Resource
    UserDao userDao;

    Logger logger;

    public void register(User user){
        userDao.addUser(user);

    }

    public String login(String account, String password){
        User user = userDao.queryUserByAcc(account);
        if(user == null) {
            return "null";
        }else if(!user.getPassword().equals(password)){
            return "false";
        }else{
            return "success";
        }
    }


}
