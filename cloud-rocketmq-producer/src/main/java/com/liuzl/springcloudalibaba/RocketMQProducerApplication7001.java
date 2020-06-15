package com.liuzl.springcloudalibaba;

import com.liuzl.springcloudalibaba.source.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @ClassName: RocketMQProducerApplication7001
 * @Description: rocketmq生产者主启动类
 * @Author: 52945
 * @Date: 2020/6/10 15:45
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({MySource.class})  /*•配置 Output 的 Binding 信息并配合 @EnableBinding 注解使其生效*/
public class RocketMQProducerApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(RocketMQProducerApplication7001.class, args);
    }

}
