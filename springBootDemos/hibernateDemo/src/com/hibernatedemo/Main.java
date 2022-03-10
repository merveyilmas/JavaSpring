package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		//bu session ile sorgular� g�ndeririz.
		
		try{
			
			session.beginTransaction();
			//sessionu ba�latt�k.
			
			//bu sorgulara HQL--->Hibernate Query Language denir.
			//List<City> cities=session.createQuery("from City").getResultList();
			//select * from demek sorgu
			//getResultList list t�r�nde veri d�nd�rd��� i�in arrayList yerine List kulland�k ve bir farklar� yoktur.
			//List<City> cities=session.createQuery("from City c where c.countryCode='TUR'").getResultList();
			//List<City> cities=session.createQuery("from City c where c.countryCode='TUR' OR c.countryCode='USA' ").getResultList();
			//List<City> cities=session.createQuery("from City c where c.countryCode='TUR' AND c.district='Ankara' ").getResultList();
			//List<City> cities=session.createQuery("from City c where c.name LIKE '%kar%' ").getResultList();
			//List<City> cities=session.createQuery("from City c ORDER BY c.name DESC").getResultList();
			//ASC-->ascending defoult olarak a dan z ye s�ralama ve y�kselen demek demek.
			//DESC--> descending tersten s�ralar ve al�alan demek.
			/*List<String> countryCodes=session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
			//countryCodelar�n sadece bit tanesini �ekmek i�in ba��na kolon ad�n� yazd�k.
			
			for(String countryCode:countryCodes) {
				System.out.println(countryCode);
			}*/
			
			//CRUD create read update delete
			
			//INSERT
			/*City city=new City();
			city.setName("D�zce1");	
			city.setCountryCode("TUR");
			city.setDistrict("D�zce");
			city.setPopulation(50000);
			
			session.save(city);*/
			
			//UPDATE
			/*City city=session.get(City.class, 4143);
			city.setPopulation(10000);
			
			session.save(city);*/
			
			//DELETE
			City city=session.get(City.class, 4143);
			session.delete(city);
			
			
			session.getTransaction().commit();
			//sessionu ger�eklel�tirdik yani veri taban�na bast�k.
							
		}finally {
			factory.close();
		}

	}

}
