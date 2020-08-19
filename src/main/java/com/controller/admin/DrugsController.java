package com.controller.admin;

import com.service.IDrugsService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DrugsController {
    @Resource
    private IDrugsService iDrugsService;
}
