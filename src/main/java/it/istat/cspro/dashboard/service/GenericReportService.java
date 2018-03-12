package it.istat.cspro.dashboard.service;

import it.istat.cspro.dashboard.dao.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class GenericReportService {

    @Autowired
    private GenericReportDao genericReportDao;

    public List<List> getGenericReport(String report, Object... params) {
        return genericReportDao.findAll(report, params);
    }

    public List<List> getPopulationResidenceReport(int type) {
        switch (type) {
            case 0:
                return genericReportDao.findAll("MR_POPULATION_TYPE_OF_RESIDENCE");
            case 1:
                return genericReportDao.findAll("MR_POPULATION_TYPE_OF_RESIDENCE_MALE");
            case 2:
                return genericReportDao.findAll("MR_POPULATION_TYPE_OF_RESIDENCE_FEMALE");
        }
        return null;
    }

}
