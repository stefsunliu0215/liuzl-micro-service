package com.liuzl.springcloudalibaba.service;

import com.liuzl.springcloudalibaba.entity.Foo;
import com.liuzl.springcloudalibaba.sink.MySink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ReceiveService
 * @Description: 接收消息服务
 * @Author: 52945
 * @Date: 2020/6/10 16:17
 * @Version: 1.0
 */
@Service
@Slf4j
public class ReceiveService {

    /**
     * @Name receiveInput1
     * @Description @StreamListener("input1")  用来监听对应的渠道是否有消息发送过来，有消息则消费
     * @Date 2020/6/10 16:18
     * @Param [receiveMsg]
     * @return void
     **/
    @StreamListener(MySink.INPUT1)
    public void receiveInput1(String receiveMsg) {
        log.info("input1 接收到了消息：" + receiveMsg);
    }

    /**
     * @Name receiveInput2
     * @Description @StreamListener("input2")  用来监听对应的渠道是否有消息发送过来，有消息则消费
     * @Date 2020/6/10 16:19
     * @Param [receiveMsg]
     * @return void
     **/
    @StreamListener(MySink.INPUT2)
    public void receiveInput2(String receiveMsg) {
        log.info("input2 接收到了消息：" + receiveMsg);
    }

    /**
     * @Name receiveInput3
     * @Description @StreamListener("input3")  用来监听对应的渠道是否有消息发送过来，有消息则消费
     * @Date 2020/6/10 16:19
     * @Param [foo]
     * @return void
     **/
    @StreamListener(MySink.INPUT3)
    public void receiveInput3(@Payload Foo foo) {
        log.info("input3 接收到了消息：" + foo);
    }

    /**
     * @Name receiveInput4
     * @Description @StreamListener("input4")  用来监听对应的渠道是否有消息发送过来，有消息则消费
     * @Date 2020/6/10 16:19
     * @Param [foo]
     * @return void
     **/
    @StreamListener(MySink.INPUT4)
    public void receiveInput4(String receiveMsg) {
        log.info("input4 接收到了消息：" + receiveMsg);
    }


}
