package com.cloud.consumer.consumer.service.impl;

import com.cloud.consumer.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello(String name,String year) {
        return restTemplate.getForObject("http://ribbon-provider/testController/test/"+name+"/"+year,String.class);
    }
}
