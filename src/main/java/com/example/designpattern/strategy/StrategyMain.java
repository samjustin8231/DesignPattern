package com.example.designpattern.strategy;

import com.example.designpattern.strategy.role.King;
import com.example.designpattern.strategy.role.Queen;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:49
 */
public class StrategyMain {
    public static void main(String[] args) {
        King king = new King();
        king.display();
        king.weaponWay();

        Queen queen = new Queen();
        queen.display();
        queen.weaponWay();
    }
}
