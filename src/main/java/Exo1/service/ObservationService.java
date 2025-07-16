package Exo1.service;

import Exo1.DAO.ObservationDAO;
import Exo1.entity.Observation;
import java.util.List;

public class ObservationService {
    private ObservationDAO observationDAO;

    public ObservationService(ObservationDAO observationDAO) {
        this.observationDAO = observationDAO;
    }

    public void createObservation(Observation observation) {
        observationDAO.save(observation);
    }

    public Observation getObservation(Long id) {
        return observationDAO.findById(id);
    }

    public List<Observation> listObservations() {
        return observationDAO.findAll();
    }

    public void deleteObservation(Long id) {
        observationDAO.delete(id);
    }
}
