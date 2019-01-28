package com.framework.assertion;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Equals{

	@Autowired
	private List<Assertion> assertionList;
	
	public boolean asserts(String expression) {
		
		for(Assertion assertion: assertionList) {
			
			Pattern pattern = Pattern.compile(assertion.getExpression());
			Matcher matcher = pattern.matcher(expression);
			
			if( matcher.find() )
				return assertion.asserts(expression);
			
		}
		String[] expressionElements=expression.split("=");
		
		return expressionElements[0].equals(expressionElements[1]);
	}

}
