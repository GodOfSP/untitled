package module.service;


import module.User;

public interface UserService {

	boolean saveUser(User user) throws Exception;
	String getUserId(String userName) throws Exception;

}
