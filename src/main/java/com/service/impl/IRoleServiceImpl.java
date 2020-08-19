package com.service.impl;

import com.dao.IRoleDao;
import com.pojo.Role;
import com.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IRoleServiceImpl implements IRoleService {
    @Resource
    private IRoleDao iRoleDao;
    @Override
    public List<Role> getAllRoles() {
        return iRoleDao.findAll();
    }

    @Override
    public void saveRole(Role role) {
        iRoleDao.saveAndFlush(role);
    }

    @Override
    public void deleteRole(int rid) {
        iRoleDao.deleteByRid(rid);
    }

    @Override
    public Role getRoleByRid(int rid) {
        return iRoleDao.findRoleByRid(rid);
    }
}
