package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RRegionalArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface RRegionalAreaDao extends JpaRepository<RRegionalArea, Integer> {

    @Query("select r from RRegionalArea r where r.name = 'ea'")
    public RRegionalArea findEA();
    
}
