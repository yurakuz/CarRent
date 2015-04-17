package home.impl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.dao.CarDAO;
import home.model.Car;
import home.service.CarService;


@Service("carService")
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDAO dao;
	
	@Transactional
	public void saveCar(Car car) {
		dao.save(car);
		
	}

	public Car getCar(Integer id) {
		return dao.findOne(id);
	}

	public Iterable<Car> getAllCar() {
		return dao.findAll();
	}
	@Transactional
	public void deleteCar(Integer id) {
		dao.delete(id);
		
	}

}
