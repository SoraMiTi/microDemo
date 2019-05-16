package com.cloud.ribbon.ribbon.service.impl;

import com.cloud.ribbon.ribbon.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String testApi() {
        return "Hello Word";
    }
}
