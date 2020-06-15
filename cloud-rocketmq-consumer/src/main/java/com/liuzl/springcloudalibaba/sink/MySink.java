package com.liuzl.springcloudalibaba.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @ClassName: MySink
 * @Description: 自定义消息接收管道
 * @Author: 52945
 * @Date: 2020/6/10 16:14
 * @Version: 1.0
 */
public interface MySink {

    String INPUT1 = "input1";
    String INPUT2 = "input2";
    String INPUT3 = "input3";
    String INPUT4 = "input4";

    @Input(INPUT1)
    SubscribableChannel input1();

    @Input(INPUT2)
    SubscribableChannel input2();

    @Input(INPUT3)
    SubscribableChannel input3();

    @Input(INPUT4)
    SubscribableChannel input4();

}
