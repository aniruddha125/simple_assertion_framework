package com.paypal.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.paypal.assertion.service.AssertionService;
import com.paypal.config.AssertionConfiguration;


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

}