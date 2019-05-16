package com.cloud.consumer.consumer.controller;

import com.cloud.consumer.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "testController")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "consumertest/{name}/{year}")
    public String getTestApiValue(@PathVariable(value = "name",required = false)String name,
                                  @PathVariable(value = "year",required = false)String year){
        return testService.sayHello(name,year)+"consumer";
    }

    @RequestMapping(value = "feginTest")
    public String getTestFeginValue(String name,String year){
        return testService.sayHello(name,year)+"consumer---fegin";
    }


}
