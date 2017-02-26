package it.istat.cspro.dashboard.rest;

import it.istat.cspro.dashboard.service.DataReportService;
import it.istat.cspro.dashboard.service.ProcessReportService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportRestController {

    @Autowired
    private DataReportService dataService;
    @Autowired
    private ProcessReportService processService;

    @RequestMapping(value = "/rest/report/list/{key}")
    public List listReport(@PathVariable("key") String key) {
        switch (key) {
            case "sexByAge":
                return dataService.getSexByAgeReport();
            case "sexByAgeGroup":
                return dataService.getSexByAgeGroupReport();
            case "religion":
                return dataService.getReligionReport();
            case "household":
                return processService.getHouseholdByEAReport();
        }
        return new ArrayList(0);
    }

    @RequestMapping(value = "/rest/report/{key}")
    public Object objectReport(@PathVariable("key") String key) {
        switch (key) {
            case "population":
                return dataService.getPopulationReport();
            case "questionnaire":
                return dataService.getQuestionnaireReport();
            case "regional":
                return dataService.getRegionalEAReport();
        }
        return new ArrayList(0);
    }

}
