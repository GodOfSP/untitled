package module.service.impl;

import module.dao.delContrastDao;
import module.dao.impl.delContrastDaoImpl;
import module.service.delContastService;

public class delContrastServiceImpl implements delContastService {

    private delContrastDao  dao = new delContrastDaoImpl();

    @Override
    public int delContrast(String cId) throws Exception {
        return dao.delContrast(cId);
    }
}
