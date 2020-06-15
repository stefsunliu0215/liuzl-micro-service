package com.liuzl.springcloudalibaba.service;

import com.liuzl.springcloudalibaba.source.MySource;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import javax.annotation.Resource;

/**
 * @ClassName: SenderService
 * @Description: 发送信息类
 * @Author: 52945
 * @Date: 2020/6/10 15:55
 * @Version: 1.0
 */
@Service
@Slf4j
public class SenderService {

    /*自定义source*/
    @Resource
    private MySource mySource;

    /**
     * 发送字符串(自定义souce)
     *
     * @param msg
     */
    public void sendMsg(String msg) {
        Message message = MessageBuilder.withPayload(msg)
                .build();
        mySource.output1().send(message);
    }

    /**
     * 发送带tag的字符串(自定义souce)
     *
     * @param msg
     * @param tag
     */
    public void sendWithTags(String msg, String tag, String key) {
        Message message = MessageBuilder.withPayload(msg)
                .setHeader(RocketMQHeaders.TAGS, tag)
                .setHeader(RocketMQHeaders.KEYS, key)
                .build();
        mySource.output1().send(message);
    }

    /**
     * 发送对象(自定义souce)
     *
     * @param msg
     * @param tag
     * @param <T>
     */
    public <T> void sendObject(T msg, String tag, String key) {
        Message message = MessageBuilder.withPayload(msg)
                .setHeader(RocketMQHeaders.TAGS, tag)
                .setHeader(RocketMQHeaders.KEYS, key)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build();
        mySource.output2().send(message);
    }

    /**
     * @Name sendTransactionalMsg
     * @Description 发送事务消息
     * @Date 2020/6/11 14:48
     * @Param [msg, num]
     * @return void
     **/
    public <T> void sendTransactionalMsg(T msg, String tag, int num) {
        Message message = MessageBuilder.withPayload(msg)
                .setHeader("tx-header-num", String.valueOf(num))
                .setHeader(RocketMQHeaders.TAGS, tag)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build();
        mySource.output3().send(message);
    }

}
