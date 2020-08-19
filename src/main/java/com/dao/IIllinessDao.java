package com.dao;

import com.pojo.Illness;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IIllinessDao extends JpaRepository<Illness, Integer> {
    void deleteById(int id);
}
