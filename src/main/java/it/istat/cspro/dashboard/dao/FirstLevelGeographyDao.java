package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.FirstLevelGeography;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FirstLevelGeographyDao extends JpaRepository<FirstLevelGeography, Integer> {
    
}
