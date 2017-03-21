package it.istat.cspro.dashboard.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.istat.cspro.dashboard.dao.Cspro2SqlDictDao;
import it.istat.cspro.dashboard.domain.Cspro2SqlDictionary;

@Service
@Transactional
public class Cspro2SqlDictonaryService {

    @Autowired
    private Cspro2SqlDictDao cspro2sqlDictDao;

    public List<Cspro2SqlDictionary> findAll() {
        return (List<Cspro2SqlDictionary>) this.cspro2sqlDictDao.findAll();
    }

    public Cspro2SqlDictionary findOne(Long id) {
        return this.cspro2sqlDictDao.findOne(id);
    }

}
