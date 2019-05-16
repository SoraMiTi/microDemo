package com.cloud.ribbon.ribbon.controller;

import com.cloud.ribbon.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
@RequestMapping(value = "testController")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test/{name}/{year}")
    public String getTestApiValue(@PathVariable(value = "name",required = false)String name,
                                  @PathVariable(value = "year",required = false)String year){
        return testService.testApi()+"--"+year+"--"+name;
    }


}
