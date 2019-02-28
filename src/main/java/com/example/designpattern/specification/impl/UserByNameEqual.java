package com.example.designpattern.specification.impl;

import com.example.designpattern.specification.User;
import com.example.designpattern.specification.specfication.CompositeSpecification;

/**
 * 类的实现描述：姓名相同的规格书
 *
 * @author sunyajun 2019/2/28 10:18 AM
 */
public class UserByNameEqual extends CompositeSpecification {

	private String name;

	public UserByNameEqual(String name) {
		this.name = name;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return user.getName().equals(this.name);
	}
}