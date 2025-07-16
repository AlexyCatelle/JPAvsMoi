package Exo1.service;


import Exo1.DAO.RegionDAO;
import Exo1.entity.Region;
import java.util.List;

public class RegionService {
    private RegionDAO regionDao;

    public RegionService(RegionDAO regionDAO) {
        this.regionDao = regionDao;
    }

    public void createRegion(Region region) {
        regionDao.save(region);
    }

    public Region getRegion(Long id) {
        return regionDao.findById(id);
    }

    public List<Region> listRegions() {
        return regionDao.findAll();
    }

    public void updateRegion(Region region) {
        regionDao.save(region);
    }

    public void deleteRegion(Long id) {
        regionDao.delete(id);
    }
}
