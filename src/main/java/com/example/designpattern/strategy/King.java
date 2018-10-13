package com.example.designpattern.strategy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:27
 */
public class King extends Role {

    public King() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    void display() {
        System.out.println("我是国王");
    }
}
