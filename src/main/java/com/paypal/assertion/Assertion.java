package com.paypal.assertion;

import org.springframework.stereotype.Component;

@Component
public interface Assertion {
	
	 boolean asserts(String expression);
	 String getExpression();

}
