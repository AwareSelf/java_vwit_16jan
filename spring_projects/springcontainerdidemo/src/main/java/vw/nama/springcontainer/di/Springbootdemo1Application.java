package vw.nama.springcontainer.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vw.nama.springcontainer.di.model.Dept;
import vw.nama.springcontainer.di.model.Emp;



@SpringBootApplication
public class Springbootdemo1Application //implements CommandLineRunner 
{
	
	@Autowired
	Emp e1;
	
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Springbootdemo1Application.class, args);
		
		Emp emp = (Emp) ctx.getBean("emp1");
		System.out.println(emp.getEmpid());
		System.out.println(emp.calcAnnSal());
		
		Dept d = emp.getDept();
		System.out.println(d.getDeptid());
		System.out.println(ctx.containsBean("dept"));
		System.out.println(ctx.containsBean("emp1"));
		System.out.println(ctx.containsBean("emp"));
		
		Dept dep = (Dept) ctx.getBean("dept");
		System.out.println(dep.getDeptid());
		System.out.println(dep.getLocation());
		
	}

	
	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * System.out.println(e1.calcAnnSal());
	 * 
	 * }
	 */
   
}

//Spring Framework
//Spring Boot Project