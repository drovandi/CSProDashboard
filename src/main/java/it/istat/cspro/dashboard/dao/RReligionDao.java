package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RReligion;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RReligionDao extends JpaRepository<RReligion, Integer> {

}
