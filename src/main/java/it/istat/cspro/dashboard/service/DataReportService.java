package it.istat.cspro.dashboard.service;

import it.istat.cspro.dashboard.dao.*;
import it.istat.cspro.dashboard.domain.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class DataReportService {

    @Autowired
    private RIndividualInfoDao rIndividualInfoDao;
    @Autowired
    private RSexByAgeDao rSexByAgeDao;
    @Autowired
    private RSexByAgeGroupDao rSexByAgeGroupDao;
    @Autowired
    private RSexByAgeGroupRegionDao rSexByAgeGroupRegionDao;
    @Autowired
    private RQuestionnaireInfoDao rQuestionnaireInfoDao;
    @Autowired
    private RQuestionnaireInfoRegionDao rQuestionnaireInfoRegionDao;
    @Autowired
    private RRegionalAreaDao rRegionalAreaDao;
    @Autowired
    private RReligionDao rReligionDao;
    @Autowired
    private RPopulationTypeResidenceDao rPopulationTypeResidenceDao;
    @Autowired
    private RPopulationTypeResidenceMaleDao rPopulationTypeResidenceMaleDao;
    @Autowired
    private RPopulationTypeResidenceFemaleDao rPopulationTypeResidenceFemaleDao;

    public RIndividualInfo getPopulationReport() {
        return rIndividualInfoDao.findAll().get(0);
    }

    public RQuestionnaireInfo getQuestionnaireReport() {
        return rQuestionnaireInfoDao.findAll().get(0);
    }

    public RQuestionnaireInfoRegion getQuestionnaireReport(int region) {
        return rQuestionnaireInfoRegionDao.findByRegion(region);
    }

    public RRegionalArea getRegionalEAReport() {
        return rRegionalAreaDao.findEA();
    }

    public List<RSexByAge> getSexByAgeReport() {
        return rSexByAgeDao.findAll();
    }

    public List<RSexByAgeGroup> getSexByAgeGroupReport() {
        return rSexByAgeGroupDao.findAll();
    }

    public List<RSexByAgeGroupRegion> getSexByAgeGroupRegionReport(int region) {
        return rSexByAgeGroupRegionDao.findByRegion(region);
    }

    public List<RReligion> getReligionReport() {
        return rReligionDao.findAll();
    }

    public List getPopulationResidenceReport(int type) {
        switch (type) {
            case 0:
                return rPopulationTypeResidenceDao.findAll();
            case 1:
                return rPopulationTypeResidenceDao.findAll();
            case 2:
                return rPopulationTypeResidenceDao.findAll();
        }
        return null;
    }

}
