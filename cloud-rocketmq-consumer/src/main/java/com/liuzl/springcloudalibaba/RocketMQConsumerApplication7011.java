package com.liuzl.springcloudalibaba;

import com.liuzl.springcloudalibaba.sink.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @ClassName: RocketMQConsumerApplication7011
 * @Description: rocketmq消费者主启动类
 * @Author: 52945
 * @Date: 2020/6/10 16:12
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({MySink.class})  /*配置 Input 的 Binding 信息并配合 @EnableBinding 注解使其生效*/
public class RocketMQConsumerApplication7011 {

    public static void main(String[] args) {
        SpringApplication.run(RocketMQConsumerApplication7011.class, args);
    }

}
