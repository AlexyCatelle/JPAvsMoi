package Exo1.service;

import Exo1.DAO.SpecieDAO;
import Exo1.entity.Specie;
import java.util.List;

public class SpecieService {
private SpecieDAO specieDAO;

public SpecieService(SpecieDAO specieDAO) {
    this.specieDAO = specieDAO;
}

public void createSpecie(Specie specie) {
    specieDAO.save(specie);
}

public Specie getSpecie(Long id) {
    return specieDAO.findById(id);
}
public List<Specie> listSpecies() {
    return specieDAO.findAll();
}

public void updateSpecie(Specie specie) {
    specieDAO.save(specie);
}

public void deleteSpecie(Long id) {
    specieDAO.delete(id);
}
}
