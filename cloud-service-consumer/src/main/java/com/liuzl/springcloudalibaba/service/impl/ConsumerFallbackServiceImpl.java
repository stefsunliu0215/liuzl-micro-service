package com.liuzl.springcloudalibaba.service.impl;

import com.liuzl.springcloudalibaba.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ConsumerFallbackServiceImpl
 * @Description: 服务降级处理类
 * @Author: 52945
 * @Date: 2020/6/8 16:02
 * @Version: 1.0
 */
@Service
@Slf4j
public class ConsumerFallbackServiceImpl implements ConsumerService {

    @Override
    public String getConfigInfo() {
        log.info("feign 熔断处理 {}", "ConsumerFallbackServiceImpl");
        return "feign {由于你访问的服务已停止或者宕机，请稍后再试！}";
    }

}
