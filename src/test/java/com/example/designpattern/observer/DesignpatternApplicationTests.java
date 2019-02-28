package com.example.designpattern.observer;

import com.example.designpattern.factory.IBusinessService;
import com.example.designpattern.observer.case1.OrderService;
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

    @Resource
    private IBusinessService businessInfoServiceImpl;

    @Test
    public void testSaveOrder() {
        OrderServiceImpl.saveOrder("computer");
    }

    @Test
    public void testGetBusinessInfoList() {
        businessInfoServiceImpl.getBusinessInfoList("renewal");
        businessInfoServiceImpl.getBusinessInfoList("ad");
    }

}
