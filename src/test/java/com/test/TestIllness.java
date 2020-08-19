package com.test;

import com.pojo.Illness;
import com.service.IIlinessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestIllness {
    @Resource
    private IIlinessService iIlinessService;
    @Test
    public void testGetAll(){
        for(Illness illness : iIlinessService.getAllIlliness()){
            System.out.println(illness);
        }
    }
    @Test
    public void saveIllness(){
        Illness illness = new Illness();
        illness.setId(7);
        illness.setName("肾结石");
        illness.setText("肾结石是个小石头");

        iIlinessService.saveIlliness(illness);
    }
    @Test
    public void testDelete(){
        iIlinessService.deleteIllinessById(4);
    }
}
