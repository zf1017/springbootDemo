package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/8 0008.
 */
@RestController
public class DemoController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello-world";
    }
}
