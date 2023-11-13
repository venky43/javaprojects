package com.firstrestcore.springrestcore;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements coach {
    
    @Override
    public String dailyworkout(){

       return "playing cricket for 30 minutes daily!!!";
    }
}
