package com.liuzl.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: DubboConsumerApplication8001
 * @Description: dubbo消费者主启动类
 * @Author: 52945
 * @Date: 2020/6/12 12:21
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboConsumerApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication8001.class, args);
    }

}
