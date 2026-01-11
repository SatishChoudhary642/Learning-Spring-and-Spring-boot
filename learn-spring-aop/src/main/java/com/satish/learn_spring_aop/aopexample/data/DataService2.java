package com.satish.learn_spring_aop.aopexample.data;

import com.satish.learn_spring_aop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

    @TrackTime
    public int[] retrieveData(){
        return new int[] {66,77,88,99};
    }
}
