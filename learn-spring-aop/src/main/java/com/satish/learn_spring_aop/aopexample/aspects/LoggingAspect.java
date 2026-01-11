package com.satish.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;

//Contains AOP configuration
@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger =LoggerFactory.getLogger(getClass());

    // Pointcut - When ?
    // execution(* PACKAGE.*.*(..))
    //   execution(...): Trigger when a method executes.
    //   * (First asterisk): Any Return Type (it doesn't matter if the method returns void, int, or String).
    //   com.satish...business: The Package to watch.
    //   .* (After package): Any Class inside that package.
    //   .* (After class): Any Method inside that class.
    //    (..): Any Arguments (it matches methods with 0 arguments, 1 argument, or 10 arguments).
    @Before("com.satish.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        logger.info("Before Aspect - {} Method is called with  - {} ",joinPoint, joinPoint.getArgs());
    }

    @After("com.satish.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        logger.info("After Aspect - {} has executed ",joinPoint);
    }

    @AfterThrowing(
            pointcut = "com.satish.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()"
            ,throwing="exception")
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception){
        logger.info("AfterThrowing Aspect - {} has Thrown an exception {}",joinPoint, exception);
    }

    @AfterReturning(
            pointcut = "com.satish.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()"
            ,returning="resultValue")
    public void logMethodCallAfterSuccessfulExcution(JoinPoint joinPoint, Object resultValue){
        logger.info("AfterReturning Aspect - {} has returned  {}",joinPoint, resultValue);
    }
}
