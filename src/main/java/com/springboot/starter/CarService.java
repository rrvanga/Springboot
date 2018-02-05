package com.springboot.starter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarService {

	private List<Car> cars;
	
	public CarService() {
		cars = new ArrayList<>(Arrays.asList(new Car(1,"Corolla", "Toyota"),
				new Car(2,"Fit", "Honda")));
				
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car getCar(Integer id) {
		
		return cars.get(id);
	}
	
	
}
