package com.wiley.cdw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.cdw.model.ClinicalData;
@Repository
public interface ClinicalDataRepo extends JpaRepository<ClinicalData, Integer> {

	//List<ClinicalData> findByPatientIdComponentNameOrderByMeasuredDataTime(int patientid, String componentName);

}
