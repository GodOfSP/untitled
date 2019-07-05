package module.dao.impl;

import com.caojian.dao.basedao.impl.BaseDaoImpl;
import module.dao.PhoneDao;

import java.util.List;
import java.util.Map;

public class PhoneDaoImpl extends BaseDaoImpl implements PhoneDao {

    @Override
    public List<Map<String,Object>> getPhoneList() throws Exception {

        String sql = "SELECT tpd.* FROM t_phone tp JOIN t_phone_detail tpd ON tp.id = tpd.phoneId;";
        List<Map<String,Object>> l =  this.queryForList(sql, new Object[] {});
        return l;
    }
}
