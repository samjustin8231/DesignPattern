package com.example.designpattern.specification.specfication;

import com.example.designpattern.specification.User;

/**
 * 类的实现描述：与规格书
 *
 * @author sunyajun 2019/2/28 10:37 AM
 */
public class AndSpecification extends CompositeSpecification {

	private IUserSpecification left;
	private IUserSpecification right;

	public AndSpecification(IUserSpecification left, IUserSpecification right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
	}
}
