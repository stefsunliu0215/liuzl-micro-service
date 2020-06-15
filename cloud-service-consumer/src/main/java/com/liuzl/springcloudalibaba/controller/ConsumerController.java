package com.liuzl.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.liuzl.springcloudalibaba.handler.SentinelBlockHandler;
import com.liuzl.springcloudalibaba.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: ConsumerController
 * @Description: 服务消费者控制层API
 * @Author: 52945
 * @Date: 2020/6/8 16:04
 * @Version: 1.0
 */
@RestController
@Slf4j
public class ConsumerController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private ConsumerService consumerService;

    @GetMapping("/consumer/feign/configInfo")
    @SentinelResource(value = "consumerConfigInfo",
            blockHandlerClass = SentinelBlockHandler.class,  /*指定自定义限流处理的类*/
            blockHandler = "handle")     /*指定自定义限流处理的类中的方法*/
    public String getServerPort(){
        log.info("服务消费者cloud-service-consumer的端口号:{}", serverPort);
        return "我是服务消费者cloud-service-consumer, 端口号:" + serverPort + "," + consumerService.getConfigInfo();
    }

    @GetMapping("/consumer/configInfo")
    public String getConfigInfo(){
        log.info("服务消费者cloud-service-consumer的端口号：" + serverPort);
        return "服务消费者cloud-service-consumer的端口号：" + serverPort;
    }

}
