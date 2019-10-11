package com.stackroute;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class User {
	
	@Value("Will_Smith")
    private String name;
	
	public String getName() {
        return name;
    }

   
}
