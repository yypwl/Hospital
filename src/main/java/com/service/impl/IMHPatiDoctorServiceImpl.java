package com.service.impl;

import com.dao.IMHPatiDoctorDao;
import com.dto.MHPatiDoctor;
import com.service.IMHPaticalHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IMHPatiDoctorServiceImpl implements IMHPaticalHistoryService {
    @Resource
    private IMHPatiDoctorDao imhPatiDoctorDao;
    @Override
    public List<MHPatiDoctor> getAllMHpatiDoctors() {
        return imhPatiDoctorDao.getAllMHPatiDoctors();
    }
}
