package module.service;


import module.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneDetailService {

   Phone getPhoneList(String phoneId) throws Exception;

}
