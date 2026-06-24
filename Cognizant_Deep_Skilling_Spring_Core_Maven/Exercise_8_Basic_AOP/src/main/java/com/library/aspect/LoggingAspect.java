package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void beforeMethod() {
        System.out.println("BEFORE method execution: Logging started");
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void afterMethod() {
        System.out.println("AFTER method execution: Logging completed");
    }
}