package com.wizards.controllers;

import com.wizards.models.Wizards;
import com.wizards.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WizardsController {

    WizardService wizardService;

    @Autowired
    public WizardsController(WizardService wizardService){
        this.wizardService = wizardService;
    }

    @GetMapping("/wizards")
    public List<Wizards> getWizards(){
        return wizardService.getWizards();
    }
    @GetMapping("/wizards/{id}")
    public Wizards getWizardsById(@PathVariable Integer id){
        return wizardService.getWizardById(id);
    }


}
