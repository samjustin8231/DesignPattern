package com.example.designpattern.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:33
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class KingTest {

    @Test
    public void display() {
        King king = new King();
        king.display();
        king.weaponWay();

        Queen queen = new Queen();
        queen.display();
        queen.weaponWay();
    }
}