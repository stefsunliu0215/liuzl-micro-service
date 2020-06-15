package com.liuzl.springcloudalibaba.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @ClassName: MySource
 * @Description: 自定义发送消息管道
 * @Author: 52945
 * @Date: 2020/6/10 15:54
 * @Version: 1.0
 */
public interface MySource {

    String OUTPUT1 = "output1";
    String OUTPUT2 = "output2";
    String TXOUTPUT = "output3";

    @Output(OUTPUT1)
    MessageChannel output1();

    @Output(OUTPUT2)
    MessageChannel output2();

    @Output(TXOUTPUT)
    MessageChannel output3();

}
