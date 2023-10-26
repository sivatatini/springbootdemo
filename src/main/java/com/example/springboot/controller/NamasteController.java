package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getIndex() {
        return "you reached get endpoint";
    }

    @PostMapping("/")
    public String postIndex(){
        return "you reached post endpoint";
    }

    @PutMapping("/")
    public String putIndex(){ return "you reached put endpoint";}

    @DeleteMapping("/")
    public String deleteIndex(){return "you reached delete endpoint";}

    @PatchMapping("/")
    public String patchIndex(){return "you reached patch endpoint";}
}