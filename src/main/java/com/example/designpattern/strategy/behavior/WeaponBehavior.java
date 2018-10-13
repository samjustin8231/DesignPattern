package com.example.designpattern.strategy.behavior;

/**
 * 类的实现描述：武器行为接口
 * 这样一来，可以随便新增加行为（可随便增加武器）
 *
 * @author sunyajun 2018/10/13 下午4:22
 */
public interface WeaponBehavior {
    /**
     * 使用武器
     */
    void useWeaPon();
}
