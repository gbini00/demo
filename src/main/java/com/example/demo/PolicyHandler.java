package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload ProductChanged productChanged){

        System.out.println("EventType = [" + productChanged.getEventType() + "]");
        System.out.println("ProductName = [" + productChanged.getProductName() + "]");
        System.out.println("ProductStock = [" + productChanged.getProductStock() + "]");
    }
}
