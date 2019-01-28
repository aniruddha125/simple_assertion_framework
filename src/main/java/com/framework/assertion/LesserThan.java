package com.framework.assertion;

import org.springframework.stereotype.Component;

@Component
public class LesserThan implements Assertion {

	@Override
	public boolean asserts(String expression) {
		
		String[] expressionItems= expression.split("<");
		
		int actual=Integer.parseInt(expressionItems[0]);
		int expected=Integer.parseInt(expressionItems[1]);
		
		return actual<expected;
				

	}

	@Override
	public String getExpression() {
		return "<";		
	}
	

}
