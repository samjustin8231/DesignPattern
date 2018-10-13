package com.example.designpattern.strategy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:23
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeaPon() {
        System.out.println("我使用斧头");
    }
}
