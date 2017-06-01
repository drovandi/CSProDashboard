package it.istat.cspro.dashboard.service;

import it.istat.cspro.dashboard.dao.CSPro2SqlErrorDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.istat.cspro.dashboard.dao.CSPro2SqlReportDao;
import it.istat.cspro.dashboard.domain.CSPro2SqlError;
import it.istat.cspro.dashboard.domain.CSPro2SqlReport;

@Service
@Transactional
public class DashboardService {

    @Autowired
    private CSPro2SqlReportDao cSPro2SqlReportDao;
    @Autowired
    private CSPro2SqlErrorDao cSPro2SqlErrorDao;

    public List<CSPro2SqlReport> getReports() {
        return cSPro2SqlReportDao.findAll();
    }

    public List<CSPro2SqlError> getErrors() {
        return cSPro2SqlErrorDao.findAll();
    }

}
