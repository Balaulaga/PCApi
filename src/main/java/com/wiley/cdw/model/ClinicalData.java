package com.wiley.cdw.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="clinicaldata")
public class ClinicalData {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="component_name")
	private String componentName;
	@Column(name="component_value")
	private String componentValue;
	@Column(name="measured_data_time")
	private Timestamp measured_data_time;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	@JsonIgnore
	private Patient patient;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getComponentValue() {
		return componentValue;
	}
	public void setComponentValue(String componentValue) {
		this.componentValue = componentValue;
	}
	public Timestamp getMeasured_data_time() {
		return measured_data_time;
	}
	public void setMeasuredDataTime(Timestamp measured_data_time) {
		this.measured_data_time = measured_data_time;
	}
	public Patient getPatient() {
		return getPatient();
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}
