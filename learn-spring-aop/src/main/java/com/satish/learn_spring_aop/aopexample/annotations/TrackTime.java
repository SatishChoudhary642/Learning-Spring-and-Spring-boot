package com.satish.learn_spring_aop.aopexample.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD) //To use this only on method
@Retention(RetentionPolicy.RUNTIME) //To use this on runtime
public @interface TrackTime {

}
