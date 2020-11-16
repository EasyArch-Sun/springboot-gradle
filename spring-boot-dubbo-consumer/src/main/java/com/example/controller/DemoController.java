package com.example.controller;

import com.example.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @DubboReference(
            url = "dubbo://127.0.0.1:1111",
            timeout = 100,
            methods = {
                    @Method(name = "firstTestDubbo", timeout = 300)
            }
    )
    private DemoService demoService;


    @RequestMapping("")
    public String demo() {
        return demoService.firstTestDubbo();
//        return "aaa";
    }
}
