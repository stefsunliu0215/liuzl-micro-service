package com.liuzl.springcloudalibaba.service.impl;

import com.liuzl.springcloudalibaba.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName: HelloServiceImpl
 * @Description: dubbo服务提供方，@Service注解仅声明该Java服务（本地）实现为Dubbo服务
 * @Author: 52945
 * @Date: 2020/6/12 11:52
 * @Version: 1.0
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        log.info(serviceName + "调用sayHello:" + name);
        return String.format("[%s] : Hello , %s", serviceName, name);
    }

}
