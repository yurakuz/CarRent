package home.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import home.model.User;

@Repository
public interface UserDAO extends
     CrudRepository<User, Integer>{




}
