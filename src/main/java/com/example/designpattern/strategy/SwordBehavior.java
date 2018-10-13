package com.example.designpattern.strategy;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:25
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeaPon() {
        System.out.println("我使用匕首");
    }
}
