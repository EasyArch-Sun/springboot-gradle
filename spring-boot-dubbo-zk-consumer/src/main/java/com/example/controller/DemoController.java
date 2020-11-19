package com.example.controller;

import com.example.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;


    @RequestMapping("")
    public String demo() {
        return demoService.firstTestDubbo();
//        return "aaa";
    }
}
