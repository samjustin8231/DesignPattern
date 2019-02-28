package com.example.designpattern.Specification.specfication;

import com.example.designpattern.Specification.User;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:39 AM
 */
public class OrSpecification extends CompositeSpecification {

	private IUserSpecification left;
	private IUserSpecification right;

	public OrSpecification(IUserSpecification left, IUserSpecification right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
	}
}
