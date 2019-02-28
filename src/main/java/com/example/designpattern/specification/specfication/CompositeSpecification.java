package com.example.designpattern.specification.specfication;

import com.example.designpattern.specification.User;

/**
 * 类的实现描述：TODO 类实现描述
 *
 * @author sunyajun 2019/2/28 10:35 AM
 */
public abstract class CompositeSpecification implements IUserSpecification {

	@Override
	public abstract boolean isSatisfiedBy(User user);

	@Override
	public IUserSpecification and(IUserSpecification spec) {
		return new AndSpecification(this, spec);
	}

	@Override
	public IUserSpecification or(IUserSpecification spec) {
		return new OrSpecification(this, spec);
	}

	@Override
	public IUserSpecification not() {
		return new NotSpecification(this);
	}
}
