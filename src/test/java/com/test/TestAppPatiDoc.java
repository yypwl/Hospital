package com.test;

import com.dao.IAppPatiDocDao;
import com.dto.AppPatiDoc;
import com.service.IAppPatiDacService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAppPatiDoc {
    @Resource
    private IAppPatiDacService iAppPatiDacService;
    @Test
    public void testGetAll(){
        for(AppPatiDoc appPatiDoc : iAppPatiDacService.getAllAppPatiDocs()){
            System.out.println(appPatiDoc);
        }
    }
}
