package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RPopulationTypeResidenceMale;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RPopulationTypeResidenceMaleDao extends JpaRepository<RPopulationTypeResidenceMale, Integer> {

}
