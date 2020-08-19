package com.service;

import com.pojo.Drugs;

import java.util.List;

public interface IDrugsService {

    List<Drugs> getAllDrugs();

    Drugs getDrugById(int id);

    void saveDrug(Drugs drugs);

    void deleteDrugById(int id);
}
