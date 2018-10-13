package com.example.designpattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午3:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {


    @Resource
    private OrderService OrderServiceImpl;

    @Test
    public void saveOrder() {
        OrderServiceImpl.saveOrder("computer");
    }
}