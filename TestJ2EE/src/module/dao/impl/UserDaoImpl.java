package module.dao.impl;

import com.caojian.dao.basedao.impl.BaseDaoImpl;
import module.User;
import module.dao.UserDao;


public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	@Override
	public int saveUser(User user) throws Exception {
		String sql = "INSERT into t_user (userName,password) values (?,?)";
		return this.executeUpdate(sql, new Object[] {user.getUserName(),user.getPassword()});
	}

	@Override
	public String getUserId(String userName) throws Exception {
		String sql = "select id from t_user where userName = ?";
		return this.queryForString(sql,new Object[]{userName});
	}


}
