package it.istat.cspro.dashboard.rest;

import it.istat.cspro.dashboard.service.DataReportService;
import it.istat.cspro.dashboard.service.ProcessReportService;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportRestController {

    private static final Pattern HOUSEHOLD_BY_PATTERN = Pattern.compile("^householdBy(.*)$");

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
            default:
                Matcher m = HOUSEHOLD_BY_PATTERN.matcher(key);
                if (m.find()) {
                    return processService.getHouseholdExpectedBy(m.group(1));
                }
        }
        return new ArrayList(0);
    }

    @RequestMapping(value = "/rest/report/{key}")
    public Object objectReport(@PathVariable("key") String key
    ) {
        switch (key) {
            case "population":
                return dataService.getPopulationReport();
            case "questionnaire":
                return dataService.getQuestionnaireReport();
            case "regional":
                return dataService.getRegionalEAReport();
            case "totals":
                return processService.getTotalExpected();
        }
        return new ArrayList(0);
    }

}
