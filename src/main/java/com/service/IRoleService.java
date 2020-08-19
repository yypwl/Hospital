package com.service;

import com.pojo.Role;

import java.util.List;

public interface IRoleService {

    List<Role> getAllRoles();

    void saveRole(Role role);

    void deleteRole(int rid);

    Role getRoleByRid(int rid);
}
