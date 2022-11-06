package com.havi.message.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long message;
    private String replyMessage;
    private String receiverType;
    private String adminStatus;
    private String senderType;
}
