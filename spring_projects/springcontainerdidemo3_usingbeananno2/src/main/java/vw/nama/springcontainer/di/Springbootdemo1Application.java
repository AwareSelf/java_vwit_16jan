package vw.nama.springcontainer.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import vw.nama.springcontainer.di.configuration.AppConfig;
import vw.nama.springcontainer.di.model.FirstBean;



//@SpringBootApplication

@PropertySource("application.properties")
@Component
public class Springbootdemo1Application //implements CommandLineRunner 
{
	
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean bean = context.getBean(FirstBean.class);
        bean.populateBeans();
        context.close();
		
	}

	
	
}
