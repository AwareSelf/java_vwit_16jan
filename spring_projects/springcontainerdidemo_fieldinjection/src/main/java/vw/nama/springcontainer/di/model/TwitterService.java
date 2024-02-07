package vw.nama.springcontainer.di.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService{

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
