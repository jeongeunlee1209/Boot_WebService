package com.min.springwebservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    //hello 화면 띄우기
    @GetMapping("/hello")
    public String hello() {

        return "HelloWorld";
    }

}
