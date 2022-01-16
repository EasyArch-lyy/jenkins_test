package com.jinxiu.project.jenkins_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * test
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/aaa")
    public String aaa(){
        String a = "test";
        return a;
    }
}
