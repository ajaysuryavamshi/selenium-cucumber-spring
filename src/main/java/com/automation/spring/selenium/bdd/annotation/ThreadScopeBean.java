package com.automation.spring.selenium.bdd.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

@Bean
@Scope(value = "browserScope")
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ThreadScopeBean {
}
