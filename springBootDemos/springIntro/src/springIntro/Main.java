package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        //IoC --> inversion of control
		//Dependency injection; IoC yap�s�n� aya�a kald�ran tasar�m deseninin ad�.
		//IoC ile birbirinin alternatifi olan i�leri y�netiriz.
	
	public static void main(String[] args) {
		
		//applicationContext.xml i okuyoruz.
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService= context.getBean("service",ICustomerService.class);
		//CustomerManager customerManager=new CustomerManager(context.getBean("database",ICustomerDal.class));
		//bu yukar�dakinin ayn�s�
		customerService.add();
		

	}
	//mesela yeni bir veriTabna� eklemek istiyoruz program�m�za.
	//yeni bir clas olu�tururuz ve onu implement ederiz interface'e.
	//buradaki customer managerdaki parametreyi de�i�tirmemiz yeterli olur kullanabilmemiz i�in.
	//b�ylece de�i�ime a��k bir kod yazm�� oluruz.
	

}
