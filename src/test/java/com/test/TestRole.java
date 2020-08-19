package com.test;

import com.pojo.Role;
import com.service.IRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRole {

    @Resource
    private IRoleService iRoleService;
    @Test
    public void testGetAll(){
        for(Role role : iRoleService.getAllRoles()){
            System.out.println(role);
        }
    }
    @Test
    public void testSave(){
        Role role = new Role();
        role.setRid(2);
        role.setRname("医生");
        role.setRdesc("你有病吗");
        iRoleService.saveRole(role);
    }
}
