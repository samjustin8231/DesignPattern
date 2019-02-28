package com.example.designpattern.specification.impl;

import com.example.designpattern.specification.IUserProvider;
import com.example.designpattern.specification.User;
import com.example.designpattern.specification.specfication.IUserSpecification;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:21 AM
 */
public class UserProvider implements IUserProvider {

	private List<User> userList;

	public UserProvider(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public List<User> findUsers(IUserSpecification userSpec) {
		List<User> users = userList.stream().filter(u -> userSpec.isSatisfiedBy(u)).collect(Collectors.toList());
//		List<User> users = new ArrayList<>();
//		for (User u : userList) {
//			if (userSpec.isSatisfiedBy(u)) {
//				users.add(u);
//			}
//		}
		return users;
	}
}
