package com.satish.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

    public int[] retrieveData(){
        return new int[] {66,77,88,99};
    }
}
