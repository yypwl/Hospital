package com.dao;

import com.pojo.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDrugsDao extends JpaRepository<Drugs,Integer> {

    Drugs findById(int id);

    void deleteById(int id);
}
