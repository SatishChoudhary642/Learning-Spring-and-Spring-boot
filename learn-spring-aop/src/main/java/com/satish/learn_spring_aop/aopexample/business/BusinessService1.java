package com.satish.learn_spring_aop.aopexample.business;

import com.satish.learn_spring_aop.aopexample.annotations.TrackTime;
import com.satish.learn_spring_aop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax(){
        int[] data = dataService1.retrieveData();

        // making method sleep to see time on findExecutionTime
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // throw new RuntimeException("Something went wrong");
        return Arrays.stream(data).max().orElse(0);
    }
}
