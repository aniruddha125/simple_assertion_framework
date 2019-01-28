package com.framework.assertion;

import org.springframework.stereotype.Component;

@Component
public class Contains implements Assertion {

	@Override
	public boolean asserts(String expression) {
		
		String[] expressionItems= expression.split("=");
		return expressionItems[0].contains(expressionItems[1].split(" ")[1]);

	}

	@Override
	public String getExpression() {
		return "Contains";		
	}
	

}
