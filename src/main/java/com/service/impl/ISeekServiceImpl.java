package com.service.impl;

import com.dao.ISeekDao;
import com.pojo.Seek;
import com.service.ISeekService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ISeekServiceImpl implements ISeekService {
    @Resource
    private ISeekDao iSeekDao;

    @Override
    public List<Seek> getAllSeeks() {
        return iSeekDao.findAll();
    }

    @Override
    public void saveSeek(Seek seek) {
        iSeekDao.save(seek);
    }

    @Override
    public void updateSeek(Seek seek) {
        iSeekDao.saveAndFlush(seek);
    }

    @Override
    public List<Seek> getSeekByPatientId(int patient_id) {
        return iSeekDao.findSeekByPatient_id(patient_id);
    }
}
