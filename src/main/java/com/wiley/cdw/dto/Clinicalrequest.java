package com.wiley.cdw.dto;

public class Clinicalrequest {

	private String  component_name;
	private String component_value;
	private int patient_id;
	public String getComponent_name() {
		return component_name;
	}
	public void setComponent_name(String component_name) {
		this.component_name = component_name;
	}
	public String getComponent_value() {
		return component_value;
	}
	public void setComponent_value(String component_value) {
		this.component_value = component_value;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	
	
}
