package module.dao.impl;

import com.caojian.dao.basedao.impl.BaseDaoImpl;
import module.dao.AddContrastDao;

public class AddContrastDaoImpl extends BaseDaoImpl implements AddContrastDao {

    public int addContrast(String userId, String phoneId) throws Exception {
        String sql = "INSERT INTO  t_relation_collection (userId,phoneId) VALUES (?,?)";
        return this.executeUpdate(sql,new Object[]{userId,phoneId});
    }
}
