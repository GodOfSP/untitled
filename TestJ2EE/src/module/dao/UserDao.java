package module.dao;


import module.User;

public interface UserDao {

	int saveUser(User user) throws Exception;

	String getUserId(String userName) throws  Exception;
	
}
