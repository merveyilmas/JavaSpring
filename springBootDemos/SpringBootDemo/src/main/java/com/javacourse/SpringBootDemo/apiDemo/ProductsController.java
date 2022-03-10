package com.javacourse.SpringBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	//biz hiçbir şey yapmasak bile programı çalıştırdığımızda bu metod çalışıcak demek bu annotation.
	@GetMapping("/")
	public String get() {
		
		return "Laptop";
	}
	
	@GetMapping("/products")
	public String get2() {
		
		return "Laptop3";
	}
}
