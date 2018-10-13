package com.example.designpattern.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternApplicationTests {

    @Resource
    private OrderService OrderServiceImpl;

    @Test
    public void saveOrder() {
        OrderServiceImpl.saveOrder("computer");
    }
}
