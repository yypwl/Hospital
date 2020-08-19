package com.service.impl;

import com.dao.IAppPatiDocDao;
import com.dto.AppPatiDoc;
import com.service.IAppPatiDacService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IAppPatiDocServiceImpl implements IAppPatiDacService {
    @Resource
    private IAppPatiDocDao iAppPatiDocDao;
    @Override
    public List<AppPatiDoc> getAllAppPatiDocs() {
        return iAppPatiDocDao.getAllAppointments();
    }
}
