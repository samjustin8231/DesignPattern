package com.example.designpattern.strategy.behavior;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:24
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeaPon() {
        System.out.println("我使用弓箭");
    }
}
