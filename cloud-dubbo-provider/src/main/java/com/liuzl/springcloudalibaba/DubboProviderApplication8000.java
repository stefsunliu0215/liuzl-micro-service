package com.liuzl.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: DubboProviderApplication8000
 * @Description: dubbo提供者主启动类
 * @Author: 52945
 * @Date: 2020/6/12 12:15
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboProviderApplication8000 {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication8000.class, args);
    }

}
