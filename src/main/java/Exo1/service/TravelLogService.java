package Exo1.service;

import Exo1.DAO.TravelLogDAO;
import Exo1.entity.TravelLog;

import java.util.List;

public class TravelLogService {
    private TravelLogDAO travelLogDAO;

    public TravelLogService(TravelLogDAO travelLogDAO) {
        this.travelLogDAO = travelLogDAO;
    }

    public void createTravelLog(TravelLog travelLog) {
        travelLogDAO.save(travelLog);
    }

    public TravelLog getTravelLog(Long id) {
        return travelLogDAO.findById(id);
    }

    public List<TravelLog> listTravelLogs() {
       return travelLogDAO.findAll();
    }

    public void updateTravelLog(TravelLog travelLog) {
        travelLogDAO.save(travelLog);
    }

    public void deleteTravelLog(Long id) {
        travelLogDAO.delete(id);
    }

}
