package home.service;

import home.model.User;

public interface UserService {
	public void saveUser(User user);
	public User getUser(Integer id);
	public Iterable<User> getAllUser();
	public void deleteUser(Integer id);
	
}
