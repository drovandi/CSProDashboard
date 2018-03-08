package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RPopulationTypeResidence;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RPopulationTypeResidenceDao extends JpaRepository<RPopulationTypeResidence, Integer> {

}
