package it.istat.cspro.dashboard.services;

import it.istat.cspro.dashboard.dao.RHouseholdByEADao;
import it.istat.cspro.dashboard.domain.RHouseholdByEA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class ProcessReportService {

    @Autowired
    private RHouseholdByEADao rHouseholdByEADao;

    public List<RHouseholdByEA> getHouseholdByEAReport() {
        return rHouseholdByEADao.findAll();
    }

}
