package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        //IoC --> inversion of control
		//Dependency injection; IoC yapýsýný ayaða kaldýran tasarým deseninin adý.
		//IoC ile birbirinin alternatifi olan iþleri yönetiriz.
	
	public static void main(String[] args) {
		
		//artýk config clasýmýzý okuyoruz.
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);
		
	    ICustomerService iCustomerService= context.getBean("service",ICustomerService.class);
	    iCustomerService.add();

	}
	//mesela yeni bir veriTabnaý eklemek istiyoruz programýmýza.
	//yeni bir clas oluþtururuz ve onu implement ederiz interface'e.
	//buradaki customer managerdaki parametreyi deðiþtirmemiz yeterli olur kullanabilmemiz için.
	//böylece deðiþime açýk bir kod yazmýþ oluruz.
	

}
