package it.istat.cspro.dashboard.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.istat.cspro.dashboard.dao.CSPro2SqlReportDao;
import it.istat.cspro.dashboard.domain.CSPro2SqlReport;

@Service
@Transactional
public class DashboardService {

    @Autowired
    private CSPro2SqlReportDao CSPro2SqlReportDao;

    public List<CSPro2SqlReport> getReports() {
        return CSPro2SqlReportDao.findAll();
    }

}
