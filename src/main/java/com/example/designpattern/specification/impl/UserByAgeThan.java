package com.example.designpattern.specification.impl;

import com.example.designpattern.specification.User;
import com.example.designpattern.specification.specfication.CompositeSpecification;

/**
 * 类的实现描述：大于基准年龄的规格书
 *
 * @author sunyajun 2019/2/28 10:19 AM
 */
public class UserByAgeThan extends CompositeSpecification {

	private int age;

	public UserByAgeThan(int age) {
		this.age = age;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return user.getAge() > this.age;
	}
}
