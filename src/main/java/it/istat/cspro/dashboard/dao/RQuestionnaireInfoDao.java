package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RQuestionnaireInfo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RQuestionnaireInfoDao extends JpaRepository<RQuestionnaireInfo, Integer> {

}
