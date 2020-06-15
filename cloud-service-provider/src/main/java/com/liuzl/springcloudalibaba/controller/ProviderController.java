package com.liuzl.springcloudalibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProviderController
 * @Description: 服务提供者控制层API
 * @Author: 52945
 * @Date: 2020/6/8 15:11
 * @Version: 1.0
 */
@RestController
@Slf4j
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/configInfo")
    public String getConfigInfo(){
        log.info("服务提供者cloud-service-provider的端口号：" + serverPort);
        return "服务提供者cloud-service-provider的端口号：" + serverPort;
    }

}
