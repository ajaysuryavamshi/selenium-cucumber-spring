package com.automation.spring.selenium.bdd.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Lazy
@Configuration
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyConfiguration {
}
