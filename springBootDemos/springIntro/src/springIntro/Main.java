package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        //IoC --> inversion of control
		//Dependency injection; IoC yapýsýný ayaða kaldýran tasarým deseninin adý.
		//IoC ile birbirinin alternatifi olan iþleri yönetiriz.
	
	public static void main(String[] args) {
		
		//applicationContext.xml i okuyoruz.
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService= context.getBean("service",ICustomerService.class);
		//CustomerManager customerManager=new CustomerManager(context.getBean("database",ICustomerDal.class));
		//bu yukarýdakinin aynýsý
		customerService.add();
		

	}
	//mesela yeni bir veriTabnaý eklemek istiyoruz programýmýza.
	//yeni bir clas oluþtururuz ve onu implement ederiz interface'e.
	//buradaki customer managerdaki parametreyi deðiþtirmemiz yeterli olur kullanabilmemiz için.
	//böylece deðiþime açýk bir kod yazmýþ oluruz.
	

}
