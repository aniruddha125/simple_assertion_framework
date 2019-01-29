package com.framework.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.framework.assertion.service.AssertionService;
import com.framework.config.AssertionConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AssertionConfiguration.class,loader=AnnotationConfigContextLoader.class)
public class Tests {

    @Autowired
    private AssertionService asserter;

    @Test
    public void testValidationService1() {

    	asserter.expressionAsserter("Aniruddha=Aniruddha");   	
    }
    
    @Test
    public void testValidationService2() {
    	asserter.expressionAsserter("Aniruddha!=Aniruddha");
    }
    
    
    @Test
    public void testValidationService3() {
    	asserter.expressionAsserter("Aniruddha=Anish");
    }
    
    @Test
    public void testValidationService4() {
    	asserter.expressionAsserter("Aniruddha!=Ani");
    }
    
    @Test
    public void testValidationService5() {
    	asserter.expressionAsserter("Aniruddha!=NULL");
    }
    
    @Test
    public void testValidationService6() {
    	asserter.expressionAsserter("Aniruddha==NULL");
    }
    
    @Test
    public void testValidationService7() {
    	asserter.expressionAsserter("1234=isNumber");
    }
    
    @Test
    public void testValidationService8() {
    	asserter.expressionAsserter("1234!=isNumber");
    }
    
    @Test
    public void testValidationService9() {
    	asserter.expressionAsserter("Aniruddha=Contains Ani");
    }
    
    @Test
    public void testValidationService10() {
    	asserter.expressionAsserter("Aniruddha!=Contains Ani");
    }
    
    @Test
    public void testValidationService11() {
    	asserter.expressionAsserter("123>901");
    }
    
    @Test
    public void testValidationService12() {
    	asserter.expressionAsserter("1234>901");
    }
    
    @Test
    public void testValidationService13() {
    	asserter.expressionAsserter("123<901");
    }
    
    @Test
    public void testValidationService14() {
    	asserter.expressionAsserter("1234<901");
    }
    
    @Test
    public void testValidationService15() {
    	asserter.expressionAsserter("1234>=901");
    }
    
    @Test
    public void testValidationService16() {
    	asserter.expressionAsserter("1234<=1234");
    }
    
    @Test
    public void testValidationService17() {
    	asserter.expressionAsserter("1234<=1233");
    }
    
    @Test
    public void testValidationService18() {
    	asserter.expressionAsserter("1234>=1234");
    }
    
    @Test
    public void testValidationService19() {
    	asserter.expressionAsserter("1234>=1235");
    }
    
    @Test
    public void testValidationService20() {
    	asserter.expressionAsserter("Ani isEmpty");
    }
    
    @Test
    public void testValidationService21() {
    	String str="";
    	asserter.expressionAsserter(str+" isEmpty");
    }

}