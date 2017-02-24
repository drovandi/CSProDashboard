package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RSexByAgeGroup;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RSexByAgeGroupDao extends JpaRepository<RSexByAgeGroup, Integer> {

}
