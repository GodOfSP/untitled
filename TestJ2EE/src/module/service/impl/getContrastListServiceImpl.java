package module.service.impl;

import module.dao.getContrastListDao;
import module.dao.impl.getContrastListDaoImpl;
import module.service.getContrastListService;

import java.util.List;
import java.util.Map;

public class getContrastListServiceImpl implements getContrastListService {

    private getContrastListDao contrastListDao = new getContrastListDaoImpl();

    @Override
    public List<Map<String, Object>> getContrastList(String userId) throws Exception {
        return contrastListDao.getContrastList(userId);
    }
}
