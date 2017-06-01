package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RHouseholdExpectedByWoreda;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RHouseholdExpectedByWoredaDao extends JpaRepository<RHouseholdExpectedByWoreda, Integer> {

}
