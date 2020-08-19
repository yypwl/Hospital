package com.test;

import com.pojo.User;
import com.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {
    @Resource
    private IUserService iUserService;
    @Test
    public void testLogin(){
        System.out.println(iUserService.login("admin1","123456"));
    }
    @Test
    public void testGetUsers(){
        for(User user : iUserService.getAllUsers()){
            System.out.println(user);
        }
    }
}
