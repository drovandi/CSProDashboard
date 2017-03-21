package it.istat.cspro.dashboard.rest;

import it.istat.cspro.dashboard.domain.Cspro2SqlDictionary;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.istat.cspro.dashboard.service.Cspro2SqlDictonaryService;
import it.istat.cspro.dashboard.service.NotificationService;

@RestController
public class DictionaryRestController {

    @Autowired
    private Cspro2SqlDictonaryService dictionaryService;
    
    @Autowired
    private NotificationService notificationService;

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/dictionary/dictlist")
    public List<Cspro2SqlDictionary> dictionarylist(Model model) {
        return dictionaryService.findAll();
    }
}
