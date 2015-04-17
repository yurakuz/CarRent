package home.impl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.dao.UserDAO;
import home.model.User;
import home.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;
	
	@Transactional
	public void saveUser(User user) {
		dao.save(user);
		
	}
	
	public User getUser(Integer id) {
		return dao.findOne(id);
	}
	
	public Iterable<User> getAllUser() {
		return dao.findAll();
	}
	@Transactional
	public void deleteUser(Integer id) {
		dao.delete(id);
		
	}

}
