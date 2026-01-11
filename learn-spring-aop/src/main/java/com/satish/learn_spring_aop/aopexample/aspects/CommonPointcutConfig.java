package com.satish.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.satish.learn_spring_aop.aopexample.* .*.*(..))")
    public void businessAndDataPackageConfig(){}
}
