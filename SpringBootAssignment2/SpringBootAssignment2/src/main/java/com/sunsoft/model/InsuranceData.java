package com.sunsoft.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurancedata")
public class InsuranceData implements Serializable{
	@Id
	@Column(name="id")
	private int insurance_id;
	@Column(name="name")
	private String insurance_name;
	@Column(name="term")
	private int insurance_term;
	@Column(name="amount")
	private int insurance_amount;
	@Column(name="type")
	private String insurance_type;
	
	public void setId(int insurance_id) {
		this.insurance_id=insurance_id;
	}
	
	public int getId() {
		return this.insurance_id;
	}
	
	public void setName(String insurance_name) {
		this.insurance_name=insurance_name;
	}
	
	public String getName() {
		return this.insurance_name;
	}
	
	public void setTerm(int insurance_term) {
		this.insurance_term=insurance_term;
	}
	
	public int getTerm() {
		return this.insurance_term;
	}
	
	public void setAmount(int insurance_amount) {
		this.insurance_amount=insurance_amount;
	}
	
	public int getAmount() {
		return this.insurance_amount;
	}
	
	public void setType(String insurance_type) {
		this.insurance_type=insurance_type;
	}
	
	public String getType() {
		return this.insurance_type;
	}
}
