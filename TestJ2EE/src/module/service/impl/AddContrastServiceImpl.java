package module.service.impl;

import module.dao.AddContrastDao;
import module.dao.impl.AddContrastDaoImpl;
import module.service.AddContrastService;

public class AddContrastServiceImpl implements AddContrastService {

    private AddContrastDao addContrastDao = new AddContrastDaoImpl();
    @Override
    public int addContrast(String userId, String phoneId) throws Exception {
        return addContrastDao.addContrast(userId,phoneId);
    }
}
