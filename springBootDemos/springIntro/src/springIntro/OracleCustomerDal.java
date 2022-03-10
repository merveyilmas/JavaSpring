package springIntro;

public class OracleCustomerDal implements ICustomerDal {
	//dal --> data acces layer
	//insert,delete vs. bu clasta yazar�z.
	
	String connectionString;
	//connectionString her veritaban�nda farkl�d�r.
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		
		System.out.println("Connection String: "+connectionString);
		System.out.println("Oracle veritaban�na eklendi..");
	}

}
