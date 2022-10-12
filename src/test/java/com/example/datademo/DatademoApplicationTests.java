package com.example.datademo;

import com.zzw.datacollect.annotation.EnableDataCollect;
import com.zzw.datacollect.test.DemoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@EnableDataCollect
class DatademoApplicationTests {
    @Autowired
    private DemoService demoService;
    @Test
    void contextLoads() {
        demoService.sayHello();
    }

}
