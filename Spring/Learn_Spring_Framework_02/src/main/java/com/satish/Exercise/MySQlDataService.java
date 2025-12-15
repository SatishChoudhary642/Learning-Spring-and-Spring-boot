package com.satish.Exercise;

import org.springframework.stereotype.Component;

@Component
public class MySQlDataService  implements DataService{
    
    public int[] retrieveData() {
        return new int[] {6,7,8,9,10};
    }
}
