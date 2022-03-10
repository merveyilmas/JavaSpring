package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        //IoC --> inversion of control
		//Dependency injection; IoC yap�s�n� aya�a kald�ran tasar�m deseninin ad�.
		//IoC ile birbirinin alternatifi olan i�leri y�netiriz.
	
	public static void main(String[] args) {
		
		//art�k config clas�m�z� okuyoruz.
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);
		
	    ICustomerService iCustomerService= context.getBean("service",ICustomerService.class);
	    iCustomerService.add();

	}
	//mesela yeni bir veriTabna� eklemek istiyoruz program�m�za.
	//yeni bir clas olu�tururuz ve onu implement ederiz interface'e.
	//buradaki customer managerdaki parametreyi de�i�tirmemiz yeterli olur kullanabilmemiz i�in.
	//b�ylece de�i�ime a��k bir kod yazm�� oluruz.
	

}
