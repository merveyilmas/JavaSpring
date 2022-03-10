package springIntro;

public class OracleCustomerDal implements ICustomerDal {
	//dal --> data acces layer
	//insert,delete vs. bu clasta yazarýz.
	
	String connectionString;
	//connectionString her veritabanýnda farklýdýr.
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		
		System.out.println("Connection String: "+connectionString);
		System.out.println("Oracle veritabanýna eklendi..");
	}

}
