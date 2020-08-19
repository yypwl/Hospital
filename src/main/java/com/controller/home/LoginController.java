package com.controller.home;

import com.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    private IUserService iUserService;
    @GetMapping("/{path}")
    public String pathComm(@PathVariable String path){
        return path;
    }
    @PostMapping("/login")
    public String userLogin(String username,String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);

        try{
            subject.login(token);
            return "success";
        }catch(AuthenticationException e){
            e.printStackTrace();
            return "failed";
        }
    }
}
