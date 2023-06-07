package com.example.aspectobjectprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AspectObjectProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectObjectProgrammingApplication.class, args);
		Emp x = Emp.builder().name("ahmed").age(45).build();
		Emp y = new Emp("ahmed",45);
		if(x.equals(y)){
			System.out.println("equal");
		}
	}

}