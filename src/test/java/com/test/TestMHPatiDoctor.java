package com.test;

import com.dao.IMHPatiDoctorDao;
import com.dto.MHPatiDoctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMHPatiDoctor {
    @Resource
    private IMHPatiDoctorDao imhPatiDoctorDao;
    @Test
    public void testGetAllMHPatiDoctors(){
        for(MHPatiDoctor mhPatiDoctor : imhPatiDoctorDao.getAllMHPatiDoctors()){
            System.out.println(mhPatiDoctor);
        }
    }
}
