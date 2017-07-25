package pl.lolx.service;

import java.util.List;

import pl.lolx.model.User;

public interface UserService {
	List<User> userList();
	
	User findOne(Long id);
	
	User addUser(User user);
	
	String deleteUser(Long id);
}
