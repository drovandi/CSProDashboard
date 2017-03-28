package it.istat.cspro.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import it.istat.cspro.dashboard.domain.Cspro2SqlDictionary;
import it.istat.cspro.dashboard.service.Cspro2SqlDictonaryService;
import java.util.List;

@Controller
public class Cspro2SqlController extends BaseController {    
    
    @Autowired
    private Cspro2SqlDictonaryService cspro2sqlDictService;

    @RequestMapping(value = "/cspro2sql/dictionary")
    public String dictionary(Model model) {
        List<Cspro2SqlDictionary> dictList = cspro2sqlDictService.findAll();
        model.addAttribute("dictList", dictList);
        return "cspro2sql/dictionary";
    }    
}