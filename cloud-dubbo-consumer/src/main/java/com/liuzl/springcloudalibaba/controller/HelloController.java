package com.liuzl.springcloudalibaba.controller;

import com.liuzl.springcloudalibaba.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: 控制层API
 * @Author: 52945
 * @Date: 2020/6/12 12:18
 * @Version: 1.0
 */
@RestController
@Slf4j
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello("Dubbo!");
    }

}
