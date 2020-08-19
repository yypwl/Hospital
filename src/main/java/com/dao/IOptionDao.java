package com.dao;

import com.pojo.Drugs;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface IOptionDao extends JpaRepository<Drugs, Serializable>{

}
