package com.example.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String firstTestDubbo() {
        return "first hello";
    }
}
