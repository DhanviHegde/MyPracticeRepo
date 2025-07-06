package com.cognizant.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DIExample {
    private MessageService messageService;

    // Constructor Injection
    @Autowired
    public DIExample(MessageService messageService) {
        this.messageService = messageService;
    }

    // Setter Injection
    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void showMessage() {
        System.out.println(messageService.getMessage());
    }
}
