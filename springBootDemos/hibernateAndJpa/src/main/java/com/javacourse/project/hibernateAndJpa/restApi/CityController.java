package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.ICityService;
import com.javacourse.project.hibernateAndJpa.Entities.*;


@RestController
@RequestMapping("/api") //zorunlu değil bunu yazmak ama yazsak daha iyi. her şeyi api le demek.
public class CityController {
	
	private ICityService iCityService;

	@Autowired
	public CityController(ICityService iCityService) {
		
		this.iCityService = iCityService;
	}
	
	//get veri tabanında bir işlem yapmak istemiyorum bana veri getir demek.
	@GetMapping("/cities")
	public List<City> get(){
		
		return iCityService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		
		iCityService.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		
		iCityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		
		iCityService.delete(city);
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id){
		
		return iCityService.getById(id);
	}

	
	
}
