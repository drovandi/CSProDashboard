package it.istat.cspro.dashboard.service;

import it.istat.cspro.dashboard.dao.RTotalExpectedDao;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedByEA;
import it.istat.cspro.dashboard.domain.RTotal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.istat.cspro.dashboard.dao.RHouseholdExpectedByEADao;
import it.istat.cspro.dashboard.dao.RHouseholdExpectedBySubcityDao;
import it.istat.cspro.dashboard.dao.RHouseholdExpectedByWoredaDao;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedBySubcity;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedByWoreda;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class ProcessReportService {

    @Autowired
    private RHouseholdExpectedByEADao rHouseholdByEADao;
    @Autowired
    private RHouseholdExpectedBySubcityDao rHouseholdBySubcityDao;
    @Autowired
    private RHouseholdExpectedByWoredaDao rHouseholdByWoredaDao;
    @Autowired
    private RTotalExpectedDao rTotalExpectedDao;

    public List<RHouseholdExpectedByEA> getHouseholdByEAReport() {
        return rHouseholdByEADao.findAll();
    }
    
    public List<RHouseholdExpectedBySubcity> getHouseholdBySubcityReport() {
        return rHouseholdBySubcityDao.findAll();
    }
    
    public List<RHouseholdExpectedByWoreda> getHouseholdByWoredaReport() {
        return rHouseholdByWoredaDao.findAll();
    }
    
    public RTotal getTotalExpected() {
        return rTotalExpectedDao.findAll().get(0);
    }

}
