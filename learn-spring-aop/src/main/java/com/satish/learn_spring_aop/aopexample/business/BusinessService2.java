package com.satish.learn_spring_aop.aopexample.business;

import com.satish.learn_spring_aop.aopexample.data.DataService2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {

    private DataService2 dataService2;

    public BusinessService2(DataService2 dataService2) {
        this.dataService2 = dataService2;
    }

    public int calculateMin(){
        int[] data = dataService2.retrieveData();

        // making method sleep to see time on findExecutionTime
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // throw new RuntimeException("Something went wrong");
        return Arrays.stream(data).min().orElse(0);
    }
}
