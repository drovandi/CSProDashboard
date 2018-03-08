package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RQuestionnaireInfoRegion;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RQuestionnaireInfoRegionDao extends JpaRepository<RQuestionnaireInfoRegion, Integer> {

    public RQuestionnaireInfoRegion findByRegion(int region);
    
}
