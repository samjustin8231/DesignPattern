package com.example.designpattern.strategy.role;

import com.example.designpattern.strategy.behavior.WeaponBehavior;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2018/10/13 下午4:26
 */
public abstract class Role {

    WeaponBehavior weaponBehavior;

    abstract void display();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void weaponWay() {
        weaponBehavior.useWeaPon();
    }
}
