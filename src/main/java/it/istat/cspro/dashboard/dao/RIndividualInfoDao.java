package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RIndividualInfo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RIndividualInfoDao extends JpaRepository<RIndividualInfo, Integer> {

}
