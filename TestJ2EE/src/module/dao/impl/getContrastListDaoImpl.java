package module.dao.impl;

import com.caojian.dao.basedao.impl.BaseDaoImpl;
import module.dao.getContrastListDao;

import java.util.List;
import java.util.Map;

public class getContrastListDaoImpl extends BaseDaoImpl implements getContrastListDao {
    @Override
    public List<Map<String, Object>> getContrastList(String userId) throws Exception {
        String sql = "SELECT  tp.* FROM t_phone tp JOIN t_relation_collection trc ON tp.id = trc.phoneId WHERE trc.userId = ?";
        return this.queryForList(sql,new Object[]{userId});
    }
}
