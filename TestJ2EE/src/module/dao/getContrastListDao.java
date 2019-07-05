package module.dao;

import java.util.List;
import java.util.Map;

public interface getContrastListDao {
    List<Map<String,Object>> getContrastList(String userId) throws Exception;
}
