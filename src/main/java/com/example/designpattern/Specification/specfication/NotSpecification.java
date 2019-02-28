package com.example.designpattern.Specification.specfication;

import com.example.designpattern.Specification.User;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:40 AM
 */
public class NotSpecification extends CompositeSpecification {

	private IUserSpecification spec;

	public NotSpecification(IUserSpecification spec) {
		this.spec = spec;
	}

	@Override
	public boolean isSatisfiedBy(User user) {
		return !spec.isSatisfiedBy(user);
	}
}
