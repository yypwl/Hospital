package com.dao;

import com.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleDao extends JpaRepository<Role,Integer>{

    void deleteByRid(int rid);

    Role findRoleByRid(int rid);
}
