package com.cloud.feign.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ribbon-consumer")
public interface FeginService {

    @RequestMapping(value = "/testController/feginTest",method = RequestMethod.GET)
    String getTestFeginValue(@RequestParam("name")String name, @RequestParam("year")String year);


}
