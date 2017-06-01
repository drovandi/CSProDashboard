package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedByEA;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RHouseholdExpectedByEADao extends JpaRepository<RHouseholdExpectedByEA, Integer> {

}
