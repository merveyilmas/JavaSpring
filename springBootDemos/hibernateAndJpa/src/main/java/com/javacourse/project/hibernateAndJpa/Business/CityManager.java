package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService{

	private ICityDal iCityDal;
	
	@Autowired //bak ICityDal a uygun bir şey varsa ver demek.
	public CityManager(ICityDal iCityDal) {
		
		this.iCityDal = iCityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		
		return this.iCityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {

		//bussines kuralları yazılır(yani mesela aynı adda veri tabloya eklenmesin vb. if bloklarıyla kontrol edilebilir.)
		this.iCityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {

		this.iCityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {

		this.iCityDal.delete(city);
		
	}

	@Override
	@Transactional
	public City getById(int id) {
		
		return this.iCityDal.getById(id);
	}

}
