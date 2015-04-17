package home.service;

import home.model.Car;

public interface CarService {
	public void saveCar(Car car);
	public Car getCar(Integer id);
	public Iterable<Car> getAllCar();
	public void deleteCar(Integer id);
	
}
