package vw.nama.springcontainer.di.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import vw.nama.springcontainer.di.model.*;

@Configuration
@PropertySource("application.properties")
public class AppConfiguration {
	
	@Value("${employee.id}")
	private int empid;
	
	@Value("${employee.name}")
	private String name;
	
	@Value("${employee.salary}")
	private double salary;
	
	@Value("20")
	private int deptno;
	
	@Value("${dept.deptname}")
	private String deptname;

	@Value("${dept.deptct}")
	private int deptct;

	@Value("Delhi")
	private String location;
	
	@Primary
	@Bean("dep2")
	public Dept depp()
	{
		return new Dept(deptno,deptname,deptct,location);
	}
	
	@Lazy(value = true)
	@Bean
	public Dept dep()
	{
		return new Dept(40,deptname,deptct,"Mumbai");
	}
	

	@Bean("emp2")
	public Emp Emp(Dept d)
	{
		return new Emp(empid,name,salary,d);
	}


}
