package com.wiley.cdw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.cdw.model.Patient;
import com.wiley.cdw.repository.PatientRepository;

@RestController
@RequestMapping("/api")
public class PatientController {

	@Autowired
	private PatientRepository repository;
	
	 PatientController(PatientRepository repository){
		 this.repository=repository;
	 }
	 @RequestMapping(value="/patients",method=RequestMethod.POST)
	public Patient createPateint(@RequestBody Patient patient) {
		return repository.save(patient);
	}
	 @RequestMapping(value="/patients/{id}",method=RequestMethod.GET)
	 public Patient getPatient(@PathVariable("id")int id) {
		 return repository.findById(id).get();
	 }
	 @RequestMapping(value="/patients",method=RequestMethod.GET)
	 public List<Patient> getAllPatient(){
		 return repository.findAll();
	 }
}
