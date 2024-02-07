package vw.nama.springcontainer.di.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private MessageService messageService;

    /*
     Update on @Autowired Annotation
	 Before Spring 4.3, we had to add an @Autowired annotation to the constructor. 
	 With newer versions, this is optional if the class has only one constructor.

     When we have a class with multiple constructors, we need to explicitly add 
     the @Autowired annotation to any one of the constructors so that Spring knows 
     which constructor to use to inject the dependencies.
     */
    
    @Autowired //optional in case of only 1 constructor
    public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
        System.out.println("constructor based dependency injection");
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
    }
}