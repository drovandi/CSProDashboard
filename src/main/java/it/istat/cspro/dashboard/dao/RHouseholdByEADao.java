package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RHouseholdByEA;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RHouseholdByEADao extends JpaRepository<RHouseholdByEA, Integer> {

}
