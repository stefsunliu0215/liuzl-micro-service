package com.liuzl.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: ConsumerApplication9001
 * @Description: 服务消费者主启动类
 * @Author: 52945
 * @Date: 2020/6/8 15:54
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication9001.class, args);
    }

}
