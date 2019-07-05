package module.service.impl;

import module.dao.PhoneDao;
import module.dao.impl.PhoneDaoImpl;
import module.service.PhoneService;

import java.util.List;
import java.util.Map;

public class PhoneServiceImpl implements PhoneService {

    PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public List<Map<String,Object>> getPhoneList() throws Exception {
        return phoneDao.getPhoneList();
    }
}
