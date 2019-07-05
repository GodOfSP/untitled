package module.service.impl;


import module.User;
import module.dao.UserDao;
import module.dao.impl.UserDaoImpl;
import module.service.UserService;

public class UserServiceImpl implements UserService {
	
	UserDao dao = new UserDaoImpl();
	@Override
	public boolean saveUser(User user) throws Exception {
		int r = dao.saveUser(user);
		return r == 1 ? true : false;
	}

	@Override
	public String getUserId(String userName) throws Exception {
		return dao.getUserId(userName);
	}

}
