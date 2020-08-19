package com.service;

import com.pojo.Seek;

import java.util.List;

public interface ISeekService {

    List<Seek> getAllSeeks();

    void saveSeek(Seek seek);

    void updateSeek(Seek seek);

    List<Seek> getSeekByPatientId(int patient_id);
}
