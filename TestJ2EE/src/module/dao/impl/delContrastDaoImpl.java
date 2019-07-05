package module.dao.impl;

import com.caojian.dao.basedao.impl.BaseDaoImpl;
import module.dao.delContrastDao;

public class delContrastDaoImpl extends BaseDaoImpl implements delContrastDao {
    @Override
    public int delContrast( String cId) throws Exception {
        String sql = "DELETE FROM t_relation_collection WHERE id = ?";
        return this.executeUpdate(sql,new Object[]{cId});
    }
}
