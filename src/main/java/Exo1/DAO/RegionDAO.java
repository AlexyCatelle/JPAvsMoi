package Exo1.DAO;

import Exo1.entity.Region;
import java.util.List;

// RegionDao.java
public interface RegionDAO {
    void save(Region region);
    Region findById(Long id);
    List<Region> findAll();
    void delete(Long id);
}

