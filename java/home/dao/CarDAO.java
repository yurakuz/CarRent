package home.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import home.model.Car;


@Repository
public interface CarDAO extends
CrudRepository< Car,Integer> {

}
