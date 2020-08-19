package com.controller.admin;

import com.service.IHospitalizationService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HospitalizationController {
    @Resource
    private IHospitalizationService iHospitalizationService;
}
