package com.cloud.feign.feign.controller;

import com.cloud.feign.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

@RestController
@RequestMapping(value = "feginController")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "fegintest/{name}/{year}")
    public String getTestApiValue(@PathVariable(value = "name",required = false)String name,
                                  @PathVariable(value = "year",required = false)String year){
        System.out.println("1111111");
        return testService.getTestFeginValue(name,year)+"----fegin----";
    }


}
