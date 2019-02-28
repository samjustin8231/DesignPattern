package com.example.designpattern.Specification;

import com.example.designpattern.Specification.specfication.IUserSpecification;

import java.util.List;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:20 AM
 */
public interface IUserProvider {
	/**
	 * 根据条件查找用户
	 *
	 * @param userSpec
	 * @return
	 */
	List<User> findUsers(IUserSpecification userSpec);
}
