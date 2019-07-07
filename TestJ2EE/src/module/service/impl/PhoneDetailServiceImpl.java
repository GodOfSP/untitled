package module.service.impl;

import module.Phone;
import module.dao.PhoneDao;
import module.dao.PhoneDetailDao;
import module.dao.impl.PhoneDaoImpl;
import module.dao.impl.PhoneDetailDaoImpl;
import module.service.PhoneDetailService;
import module.service.PhoneService;

import java.util.List;
import java.util.Map;

public class PhoneDetailServiceImpl implements PhoneDetailService {

    PhoneDetailDao phoneDetailDao = new PhoneDetailDaoImpl();

    @Override
    public Phone getPhoneList(String phoneId) throws Exception {
        return phoneDetailDao.getPhoneDetail(phoneId);
    }
}
