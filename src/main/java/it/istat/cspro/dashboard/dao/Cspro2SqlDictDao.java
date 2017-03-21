package it.istat.cspro.dashboard.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import it.istat.cspro.dashboard.domain.Cspro2SqlDictionary;

@Repository
public interface Cspro2SqlDictDao extends CrudRepository<Cspro2SqlDictionary, Long> {
    
}
