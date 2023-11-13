package com.firstrestcore.springrestcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class DemoController {
    
    //define private field for the dependency
    private coach mycoach;

    // define constructor for dependency injection

    @Autowired
    public DemoController(coach themycoach){
       mycoach = themycoach;
    }

    @GetMapping("/dailyworkout")
    public String mycoachingin(){
        return mycoach.dailyworkout();
    }
}
