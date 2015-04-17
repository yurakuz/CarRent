package home.dao;

import home.model.History;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HistoryDAO extends
CrudRepository < History, Integer>{

}
