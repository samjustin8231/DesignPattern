package com.example.designpattern.specification.specfication;

import com.example.designpattern.specification.User;

/**
 * 类的实现描述：规格书接口
 *
 * @author sunyajun 2019/2/28 10:17 AM
 */
public interface IUserSpecification {
	/**
	 * 候选者是否满足要求
	 *
	 * @param user
	 * @return
	 */
	boolean isSatisfiedBy(User user);

	/**
	 * 与操作
	 *
	 * @param spec
	 * @return
	 */
	IUserSpecification and(IUserSpecification spec);

	/**
	 * 或操作
	 *
	 * @param spec
	 * @return
	 */
	IUserSpecification or(IUserSpecification spec);

	/**
	 * 非操作
	 *
	 * @return
	 */
	IUserSpecification not();
}
