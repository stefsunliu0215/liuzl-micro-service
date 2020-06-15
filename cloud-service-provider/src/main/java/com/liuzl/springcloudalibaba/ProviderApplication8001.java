package com.liuzl.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: ProviderApplication8001
 * @Description: 服务提供者主启动类
 * @Author: 52945
 * @Date: 2020/6/8 15:08
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8001.class, args);
    }

}
