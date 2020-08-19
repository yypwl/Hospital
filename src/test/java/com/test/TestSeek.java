package com.test;

import com.pojo.Seek;
import com.service.ISeekService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSeek {
    @Resource
    private ISeekService iSeekService;
    @Test
    public void testGetAllSeeks(){
        for(Seek seek : iSeekService.getAllSeeks()){
            System.out.println(seek);
        }
    }
    @Test
    public void testGetSeekByPatientId(){
        for(Seek seek : iSeekService.getSeekByPatientId(1)){
            System.out.println(seek);
        }
    }
}
