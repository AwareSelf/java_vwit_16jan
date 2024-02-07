package vw.nama.springcontainer.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import vw.nama.springcontainer.di.config.AppConfig;
import vw.nama.springcontainer.di.model.MessageSender;

//https://www.javaguides.net/2023/01/spring-boot-constructor-injection.html

public class MainApp 
{
	

	
	public static void main(String[] args) {
		 String message = "Hi, good morning have a nice day!.";
	        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

	        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
	        messageSender.processMsg(message);
	        
	        ((AbstractApplicationContext)applicationContext).close();
		
	}

	
	
}
