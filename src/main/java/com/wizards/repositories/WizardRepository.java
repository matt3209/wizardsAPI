package com.wizards.repositories;

import com.wizards.models.Wizards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WizardRepository extends JpaRepository<Wizards, Integer> {
}
