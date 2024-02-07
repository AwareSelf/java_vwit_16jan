package vw.nama.springcontainer.di.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MessageSender {

    @Autowired
    @Qualifier("TwitterService")
    private MessageService messageService;

    public void processMsg(String message) {
        messageService.sendMessage(message);
    }
}