package com.cloud.feign.feign.service.impl;

import com.cloud.feign.feign.rpc.FeginService;
import com.cloud.feign.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private FeginService feginService;

    @Override
    public String getTestFeginValue(String name, String year) {
        return feginService.getTestFeginValue(name,year);
    }
}
