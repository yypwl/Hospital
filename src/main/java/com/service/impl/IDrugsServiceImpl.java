package com.service.impl;

import com.dao.IDrugsDao;
import com.pojo.Drugs;
import com.service.IDrugsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IDrugsServiceImpl implements IDrugsService {
    @Resource
    private IDrugsDao iDrugsDao;
    @Override
    public List<Drugs> getAllDrugs() {
        return iDrugsDao.findAll();
    }

    @Override
    public Drugs getDrugById(int id) {
        return iDrugsDao.findById(id);
    }

    @Override
    public void saveDrug(Drugs drugs) {
        iDrugsDao.saveAndFlush(drugs);
    }

    @Override
    public void deleteDrugById(int id) {
        iDrugsDao.deleteById(id);
    }

}
