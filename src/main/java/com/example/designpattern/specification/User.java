package com.example.designpattern.specification;

import lombok.Data;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:06 AM
 */
@Data
public class User {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
