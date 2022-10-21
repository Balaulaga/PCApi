package com.wiley.cdw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.cdw.dto.Clinicalrequest;
import com.wiley.cdw.model.ClinicalData;
import com.wiley.cdw.model.Patient;
import com.wiley.cdw.repository.ClinicalDataRepo;
import com.wiley.cdw.repository.PatientRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ClinicalDataController {

	@Autowired
	private PatientRepository patientrepository;
	private ClinicalDataRepo clinicalrepo;
	
	ClinicalDataController(ClinicalDataRepo clinicalrepo,PatientRepository patientrepository){
		this.clinicalrepo=clinicalrepo;
		this.patientrepository=patientrepository;
	}
	@RequestMapping(value="/clinicals",method=RequestMethod.POST)
	public ClinicalData savedClinicalData(@RequestBody Clinicalrequest request) {
		Patient patient = patientrepository.findById(request.getPatient_id()).get();
		ClinicalData clinical=new ClinicalData();
		clinical.setComponentName(request.getComponent_name());
		clinical.setComponentValue(request.getComponent_value());
		clinical.setPatient(patient);
		return clinicalrepo.save(clinical);
	}
	/*@RequestMapping(value="/clinicals/{patientId}/{componentName}",method=RequestMethod.GET)
	public List<ClinicalData> getClinicaldata(@PathVariable("patientId")int patientId,@PathVariable("componentName")String componentName){
		return clinicalrepo.findByPatientIdComponentNameOrderByMeasuredDataTime(patientId,componentName);
	}*/
}
