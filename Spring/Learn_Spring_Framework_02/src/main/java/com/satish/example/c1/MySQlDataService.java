package com.satish.example.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
@Repository
public class MySQlDataService  implements DataService{
    
    public int[] retrieveData() {
        return new int[] {6,7,8,9,10};
    }
}
