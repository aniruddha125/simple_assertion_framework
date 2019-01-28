package com.framework.assertion;

import org.springframework.stereotype.Component;

@Component
public class IsNull implements Assertion {

	@Override
	public boolean asserts(String expression) {
		
		String[] actual= expression.split("=");
		return actual[0]== null;

	}

	@Override
	public String getExpression() {
		return "NULL";		
	}
	

}
