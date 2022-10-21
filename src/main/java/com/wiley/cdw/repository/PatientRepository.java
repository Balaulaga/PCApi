package com.wiley.cdw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiley.cdw.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
