package com.springdemo;

public class CustomerManager implements ICustomerService {

	private ICustomerDal iCustomerDal;	

	//constructor injection 
	public CustomerManager(ICustomerDal iCustomerDal) {
		this.iCustomerDal = iCustomerDal;
	}

	public void add() {
		//i� kurallar� yani m��teri eklendi mi, eklenebilir mi vs..
		//e�er t�m ko�ullar sa�lan�yorsa biz customerDal � �a��r�r�z.
		
		// bir class ba�ka bir class � kulland���nda onu new lememelidir.
		//IoC bize bunu yapar.
		
		iCustomerDal.add();
	}
}
