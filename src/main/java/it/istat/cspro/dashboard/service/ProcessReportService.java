package it.istat.cspro.dashboard.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.istat.cspro.dashboard.dao.RHouseholdExpectedDao;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedBase;
import it.istat.cspro.dashboard.dao.REaExpectedDao;
import it.istat.cspro.dashboard.domain.REaExpectedBase;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class ProcessReportService {

    @Autowired
    private RHouseholdExpectedDao rHouseholdExpectedDao;

    @Autowired
    private REaExpectedDao rEaExpectedDao;
    
    public List<RHouseholdExpectedBase> getHouseholdExpectedBy(String table) {
        return rHouseholdExpectedDao.getExpectedReportBy(table);
    }

    public List<REaExpectedBase> getEaExpectedBy(String table) {
        return rEaExpectedDao.getExpectedReportBy(table);
    }

}
