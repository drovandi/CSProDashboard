package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RSexByAge;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RSexByAgeDao extends JpaRepository<RSexByAge, Integer> {

}
