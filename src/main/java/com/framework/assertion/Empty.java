package com.framework.assertion;

import org.springframework.stereotype.Component;

@Component
public class Empty implements Assertion {

	@Override
	public boolean asserts(String expression) {
		
		return expression.substring(0,expression.indexOf("isEmpty")).trim().isEmpty();

	}

	@Override
	public String getExpression() {
		return "isEmpty";		
	}

}
