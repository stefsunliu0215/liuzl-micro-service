package com.liuzl.springcloudalibaba.service;

import com.liuzl.springcloudalibaba.service.impl.ConsumerFallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: ConsumerService
 * @Description: feign调用接口
 * @Author: 52945
 * @Date: 2020/6/8 16:00
 * @Version: 1.0
 */
@FeignClient(name = "cloud-service-provider", fallback = ConsumerFallbackServiceImpl.class)
public interface ConsumerService {

    @GetMapping("/provider/configInfo")
    public String getConfigInfo();

}
