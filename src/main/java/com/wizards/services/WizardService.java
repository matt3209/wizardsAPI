package com.wizards.services;

import com.wizards.models.Wizards;
import com.wizards.repositories.WizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WizardService {
    private WizardRepository wizRepo;

    @Autowired
    public WizardService(WizardRepository wizRepo) {
        this.wizRepo = wizRepo;
    }

    public List<Wizards> getWizards(){
        return wizRepo.findAll();
    }

    public Wizards getWizardById(Integer id) {
        return wizRepo.findById(id).get();
    }

    public Optional<Wizards> updateWizardById(Integer id, Wizards newWizard) {
        return wizRepo.findById(id).map(wizard -> {
            wizard.setStr(newWizard.getStr());
            wizard.setSpeed(newWizard.getSpeed());
            wizard.setSpells(newWizard.getSpells());
            wizard.setStamina(newWizard.getStamina());
            wizard.setIntel(newWizard.getIntel());
            wizard.setType(newWizard.getType());
            wizard.setLevel(newWizard.getLevel());
            wizard.setRegion(newWizard.getRegion());
            wizard.setName(newWizard.getName());
            wizard.setRegion(newWizard.getRegion());
            return wizRepo.save(wizard);
        });
    }
}
