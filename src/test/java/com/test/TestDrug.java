package com.test;

import com.pojo.Drugs;
import com.service.IDrugsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDrug {
    @Resource
    private IDrugsService iDrugsService;
    @Test
    public void testDrugs(){
        for(Drugs drug : iDrugsService.getAllDrugs()){
            System.out.println(drug);
        }
    }
    @Test
    public void testGetDrugById(){
        System.out.println(iDrugsService.getDrugById(1));
    }
    @Test
    public void saveDrug(){
        Drugs drugs = new Drugs();
        drugs.setId(15);
        drugs.setName("布洛芬");
        drugs.setNumber(2);
        drugs.setPrice(67);
        drugs.setType(1);
        drugs.setText("skghskgs");
        iDrugsService.saveDrug(drugs);
    }
    @Test
    public void testDelete(){
        iDrugsService.deleteDrugById(15);
    }
}
