package com.springboot.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.starter.Car;
import com.springboot.starter.CarService;

@RestController
public class RestControllerClass {
	
	@Autowired
	private CarService carService;

	@RequestMapping(method=RequestMethod.GET, value="/cars")
	public List<Car> getCars() {
		return carService.getCars();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/cars/{id}")
	public Car getCar(@PathVariable("id") Integer id) {
		return carService.getCar(id);
	}
	
	
	
	
	
	
	
	
}
