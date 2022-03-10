package springIntro;

public class CustomerManager implements ICustomerService {

	private ICustomerDal iCustomerDal;	

	//constructor injection 
	//public CustomerManager(ICustomerDal iCustomerDal) {
	//	this.iCustomerDal = iCustomerDal;
	//}
	
	//setter injection 
	public void setiCustomerDal(ICustomerDal iCustomerDal) {
		this.iCustomerDal = iCustomerDal;
	}
	//iki injaction çeþidi de doðru ama sektörde genelde constructor injection kullanýlýr.

	public void add() {
		//iþ kurallarý yani müþteri eklendi mi, eklenebilir mi vs..
		//eðer tüm koþullar saðlanýyorsa biz customerDal ý çaðýrýrýz.
		
		// bir class baþka bir class ý kullandýðýnda onu new lememelidir.
		//IoC bize bunu yapar.
		
		iCustomerDal.add();
	}
}
