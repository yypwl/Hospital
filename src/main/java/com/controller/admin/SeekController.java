package com.controller.admin;

import com.service.ISeekService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SeekController {
    @Resource
    private ISeekService iSeekService;
}
