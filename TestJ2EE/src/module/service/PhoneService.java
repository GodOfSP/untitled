package module.service;


import java.util.List;
import java.util.Map;

public interface PhoneService {

    List<Map<String,Object>>   getPhoneList() throws Exception;

}
