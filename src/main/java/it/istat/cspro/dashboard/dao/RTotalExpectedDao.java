package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RTotal;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RTotalExpectedDao extends JpaRepository<RTotal, Integer> {

}
