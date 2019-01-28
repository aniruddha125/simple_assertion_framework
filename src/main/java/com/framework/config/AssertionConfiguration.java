package com.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.framework.assertion.service.AssertionService;

@ComponentScan("com.framework")
@Configuration
public class AssertionConfiguration {

        @Bean
        public AssertionService validationService() {

        	 return new AssertionService();
        }
    }