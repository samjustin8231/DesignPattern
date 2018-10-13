package com.example.designpattern.strategy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:29
 */
public class Knight extends Role {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    void display() {
        System.out.println("我是骑士");
    }
}