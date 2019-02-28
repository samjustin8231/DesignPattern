package com.example.designpattern.specification;

import com.example.designpattern.specification.impl.UserByAgeThan;
import com.example.designpattern.specification.impl.UserProvider;
import com.example.designpattern.specification.specfication.IUserSpecification;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:23 AM
 */
@Slf4j
public class Client {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("san", 3));
		users.add(new User("san1", 5));
		users.add(new User("sa3", 2));
		users.add(new User("sa2", 1));
		users.add(new User("san5", 8));
		users.add(new User("san11", 3));
		users.add(new User("san7", 3));

		IUserProvider userProvider = new UserProvider(users);
		IUserSpecification userSpecification = new UserByAgeThan(5);
		for (User u : userProvider.findUsers(userSpecification)) {
			log.info("result:{}", u);

		}
	}
}
