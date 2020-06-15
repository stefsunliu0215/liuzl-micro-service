package com.liuzl.springcloudalibaba.controller;

import com.liuzl.springcloudalibaba.entity.Foo;
import com.liuzl.springcloudalibaba.service.SenderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: RMProducerController
 * @Description: rocketmq生产者控制层API
 * @Author: 52945
 * @Date: 2020/6/10 15:59
 * @Version: 1.0
 */
@RestController
@RequestMapping("/rocket/producer")
public class RMProducerController {

    @Resource
    private SenderService senderService;

    @GetMapping("/sendMsg")
    public String sendMsg(String msg) {
        senderService.sendMsg(msg);
        return "自定义Source字符串消息发送成功!";
    }

    @GetMapping("/sendWithTags")
    public String sendWithTags(String msg) {
        senderService.sendWithTags(msg, "tagStr", "liuzl");
        return "带tag字符串消息发送成功!";
    }

    @GetMapping("/sendObject")
    public String sendObject(int index) {
        senderService.sendObject(new Foo(index, "foo"), "tagObj", "liuzl");
        return "Object对象消息发送成功!";
    }

    @GetMapping("/sendTransactionalMsg")
    public String sendTransactionalMsg(int num, String msg) {
        senderService.sendTransactionalMsg(msg, "binder", num);
        return "事务消息发送成功!";
    }

}
