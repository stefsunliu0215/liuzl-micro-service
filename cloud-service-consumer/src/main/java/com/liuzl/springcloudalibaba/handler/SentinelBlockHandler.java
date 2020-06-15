package com.liuzl.springcloudalibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @ClassName: SentinelBlockHandler
 * @Description: sentinel服务降级，限流异常处理类
 * @Author: 52945
 * @Date: 2020/6/8 16:41
 * @Version: 1.0
 */
public class SentinelBlockHandler {

    public static String handle(BlockException exception){
        return "由于你的访问次数太多，已为你限流、您已进入保护模式，请稍后再试！";
    }

}
