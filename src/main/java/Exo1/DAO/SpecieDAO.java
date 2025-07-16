package Exo1.DAO;

import Exo1.entity.Specie;
import java.util.List;

public interface SpecieDAO {
    void save(Specie specie);
    Specie findById(Long id);
    List<Specie> findAll();
    void delete(Long id);
}
