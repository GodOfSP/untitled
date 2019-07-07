package module.dao;


import module.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneDetailDao {
    Phone getPhoneDetail(String phoneId) throws Exception;
}
