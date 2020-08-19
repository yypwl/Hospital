package com.service.impl;

import com.dao.IUserDao;
import com.pojo.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao iUserDao;
    @Override
    public User login(String username,String password) {
        return iUserDao.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public List<User> getAllUsers() {
        return iUserDao.findAllUsers();
    }
}
