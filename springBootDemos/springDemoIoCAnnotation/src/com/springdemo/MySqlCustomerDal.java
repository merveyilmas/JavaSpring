package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//annotation
//@Component("database") 
//component tek bir class a tanýmlanabildiði için pek kullanýþlý deðil.
//bu yüzden config classýmýza bean tanýmlayacaðýz.
public class MySqlCustomerDal implements ICustomerDal {

	@Value("${database.connectionString}")
	String connectionString;
		
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("Connection String: "+connectionString);
		System.out.println("MySql veritabanýna eklendi..");
	}

	
}
