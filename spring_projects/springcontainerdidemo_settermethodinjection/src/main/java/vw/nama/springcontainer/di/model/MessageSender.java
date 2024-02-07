package vw.nama.springcontainer.di.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MessageSender {

    private MessageService messageService;

    private MessageService smsService;

    @Autowired
    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("setter based dependency injection 1");
    }

    @Autowired
    public void setSmsService(MessageService smsService) {
        this.smsService = smsService;
        System.out.println("setter based dependency injection 2");
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}