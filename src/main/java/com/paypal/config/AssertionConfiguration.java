package com.paypal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.paypal.assertion.service.AssertionService;

@ComponentScan("com.paypal")
@Configuration
public class AssertionConfiguration {

        @Bean
        public AssertionService validationService() {

        	 return new AssertionService();
        }
    }