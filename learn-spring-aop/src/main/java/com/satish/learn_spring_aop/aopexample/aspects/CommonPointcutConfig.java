package com.satish.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.satish.learn_spring_aop.aopexample.* .*.*(..))")
    public void businessAndDataPackageConfig(){}

    @Pointcut("execution(* com.satish.learn_spring_aop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){}

    @Pointcut("execution(* com.satish.learn_spring_aop.aopexample.data.*.*(..))")
    public void dataPackageConfig(){}

    //will match any Spring Bean whose name contains the word "Service".
    @Pointcut("bean(*Service*)")
    public void allPackageCongifUsingBean(){}

    @Pointcut("@annotation(com.satish.learn_spring_aop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation(){}
}
