package com.satish.learn_spring_aop.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.annotation.Aspect;

//Contains AOP configuration
@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger =LoggerFactory.getLogger(getClass());

    // Pointcut - When ?
    // execution(* PACKAGE.*.*(..))
    @Before("execution(* com.satish.learn_spring_aop.aop.business .*.*(..))")
    public void logMethodCall(JoinPoint joinPoint){
        logger.info("Before Aspect - Method is called - {} ",joinPoint);
    }
}
