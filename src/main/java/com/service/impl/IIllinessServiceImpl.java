package com.service.impl;

import com.dao.IIllinessDao;
import com.pojo.Illness;
import com.service.IIlinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IIllinessServiceImpl implements IIlinessService {
    @Resource
    private IIllinessDao iIllinessDao;
    @Override
    public List<Illness> getAllIlliness() {
        return iIllinessDao.findAll();
    }

    @Override
    public void saveIlliness(Illness illness) {
        iIllinessDao.save(illness);
    }

    @Override
    public void updateIlliness(Illness illness) {
        iIllinessDao.saveAndFlush(illness);
    }

    @Override
    public void deleteIllinessById(int id) {
        iIllinessDao.deleteById(id);
    }
}
