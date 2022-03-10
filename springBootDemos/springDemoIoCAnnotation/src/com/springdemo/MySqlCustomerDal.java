package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//annotation
//@Component("database") 
//component tek bir class a tan�mlanabildi�i i�in pek kullan��l� de�il.
//bu y�zden config class�m�za bean tan�mlayaca��z.
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
		System.out.println("MySql veritaban�na eklendi..");
	}

	
}
