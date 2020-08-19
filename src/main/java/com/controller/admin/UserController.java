package com.controller.admin;

import com.service.IUserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private IUserService iUserService;
}
