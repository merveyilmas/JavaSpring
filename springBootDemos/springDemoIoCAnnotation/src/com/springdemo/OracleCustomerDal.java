package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;
//burada da component kullan�rsak hata al�r�z.
//sadece tek bir class da component kullanabiliriz.
//@Component("database") 
public class OracleCustomerDal implements ICustomerDal {
	//dal --> data acces layer
	//insert,delete vs. bu clasta yazar�z.
	
	@Value("${database.connectionString}")
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
