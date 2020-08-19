package com.service;

import com.pojo.Illness;

import java.util.List;

public interface IIlinessService {

    List<Illness> getAllIlliness();

    void saveIlliness(Illness illness);

    void updateIlliness(Illness illness);

    void deleteIllinessById(int id);
}
