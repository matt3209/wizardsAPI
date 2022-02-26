package com.wizards.services;

import com.wizards.models.Wizards;
import com.wizards.repositories.WizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
