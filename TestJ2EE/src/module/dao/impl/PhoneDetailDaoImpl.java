package module.dao.impl;

import com.caojian.dao.basedao.impl.BaseDaoImpl;
import module.Phone;
import module.dao.PhoneDao;
import module.dao.PhoneDetailDao;

import java.util.List;
import java.util.Map;

public class PhoneDetailDaoImpl extends BaseDaoImpl implements PhoneDetailDao {


    @Override
    public Phone getPhoneDetail(String phoneId) throws Exception {
        String sql = "SELECT tpd.* FROM t_phone tp JOIN t_phone_detail tpd ON tp.id = tpd.phoneId where tp.id = ?";
        String h  =  this.queryForString(sql,new Object[]{phoneId});
        Phone o  = (Phone) this.queryForObject(sql,new Object[]{phoneId});
        return o;
    }
}
