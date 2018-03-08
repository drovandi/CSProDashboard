package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RPopulationTypeResidenceFemale;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RPopulationTypeResidenceFemaleDao extends JpaRepository<RPopulationTypeResidenceFemale, Integer> {

}
