package com.example.exercise18;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/devname")
    public String getDevName(){
        return "Federico";
    }
}