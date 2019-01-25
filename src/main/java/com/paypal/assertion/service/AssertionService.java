package com.paypal.assertion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import com.paypal.assertion.Equals;

public class AssertionService {

	@Autowired
	private Equals equals;

	public void expressionAsserter(String expression) {

		validate(expression, expression.contains("!"));

	}

	private void validate(String expression, boolean flag) {
		int index = expression.indexOf('!');
		int indexOfEquals = expression.indexOf('=');

		if (index == -1 && indexOfEquals == -1) {
			Assert.assertTrue(equals.asserts(expression), "Expression : " + expression + " failed validation ");
		} else {
			String actual = flag ? expression.substring(0, index) : expression.substring(0, indexOfEquals);
			String expected = expression.substring(indexOfEquals + 1);

			if (flag) {
				Assert.assertTrue(!equals.asserts(actual + "=" + expected),
						"Expression : " + expression + " failed validation ");
			} else {
				Assert.assertTrue(equals.asserts(actual + "=" + expected),
						"Expression : " + expression + " failed validation ");
			}
		}

	}
}
