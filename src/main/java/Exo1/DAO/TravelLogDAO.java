package Exo1.DAO;

import java.util.List;
import Exo1.entity.TravelLog;

public interface TravelLogDAO {
    void save(TravelLog travellog);
    TravelLog findById(Long id);
    List<TravelLog> findAll();
    void delete(Long id);
}
