package it.istat.cspro.dashboard.service;

import it.istat.cspro.dashboard.dao.RTotalExpectedDao;
import it.istat.cspro.dashboard.domain.RTotal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.istat.cspro.dashboard.dao.RHouseholdExpectedDao;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedBase;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class ProcessReportService {

    @Autowired
    private RTotalExpectedDao rTotalExpectedDao;
    @Autowired
    private RHouseholdExpectedDao rHouseholdExpectedDao;

    public List<RHouseholdExpectedBase> getHouseholdExpectedBy(String table) {
        return rHouseholdExpectedDao.getExpectedReportBy(table);
    }
    
    public RTotal getTotalExpected() {
        return rTotalExpectedDao.findAll().get(0);
    }

}
