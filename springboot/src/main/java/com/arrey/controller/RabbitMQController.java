package com.arrey.controller;

import com.arrey.demo.rabbitmq.fanout.FanoutSender;
import com.arrey.demo.rabbitmq.hello.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitMQController {
    @Autowired
    MsgProducer msgProducer;
    @Autowired
    FanoutSender fanoutSender;

    @RequestMapping("hello")
    public void sendMsg() {
        msgProducer.sendMsg("hello world!!!");
    }

    @RequestMapping("fanout")
    public void fanoutSendMsg() {
        fanoutSender.send();
    }
}
