package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedBySubcity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RHouseholdExpectedBySubcityDao extends JpaRepository<RHouseholdExpectedBySubcity, Integer> {

}
