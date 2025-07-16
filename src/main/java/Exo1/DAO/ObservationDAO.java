package Exo1.DAO;

import Exo1.entity.Observation;
import java.util.List;

public interface ObservationDAO {
    void save(Observation observation);
    Observation findById(Long id);
    List<Observation> findAll();
    void delete(Long id);
}
