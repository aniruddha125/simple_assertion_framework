package com.framework.assertion;

import org.springframework.stereotype.Component;

@Component
public class LesserThan implements Assertion {

	@Override
	public boolean asserts(String expression) {
		
		String[] expressionItems= expression.split("<");
		
		int actual=Integer.parseInt(expressionItems[0]);
		if(expressionItems[1].contains("=")) {
			return actual<=Integer.parseInt(expressionItems[1].substring(expressionItems[1].indexOf('=')+1));
		}else {
			return actual<Integer.parseInt(expressionItems[1]);
		}				
	}

	@Override
	public String getExpression() {
		return "<";		
	}
	

}
