package it.istat.cspro.dashboard.controller;

import it.istat.cspro.dashboard.domain.CSPro2SqlReport;
import it.istat.cspro.dashboard.service.DashboardService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {
    
    @Autowired
    private DashboardService service;
    
    @ModelAttribute("reports")
    public Set<String> getReports() {
        Set<String> reports = new HashSet<>();
        for (CSPro2SqlReport r : service.getReports()) {
            reports.add(r.getName());
        }
        return reports;
    }
    
}
