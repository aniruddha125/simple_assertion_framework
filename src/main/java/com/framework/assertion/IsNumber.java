package com.framework.assertion;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class IsNumber implements Assertion {

	@Override
	public boolean asserts(String expression) {
		
		String[] expressionItems= expression.split("=");
		return StringUtils.isNumeric(expressionItems[0]);

	}

	@Override
	public String getExpression() {
		return "isNumber";		
	}

}
