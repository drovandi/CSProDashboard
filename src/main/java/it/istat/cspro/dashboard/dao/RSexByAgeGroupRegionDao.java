package it.istat.cspro.dashboard.dao;

import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.RSexByAgeGroupRegion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RSexByAgeGroupRegionDao extends JpaRepository<RSexByAgeGroupRegion, Integer> {
    
    public List<RSexByAgeGroupRegion> findByRegion(int region);

}
