package com.sunsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sunsoft.dao.InsuranceDao;
import com.sunsoft.model.InsuranceData;



@RestController
public class InsuranceController {
	@Autowired
	InsuranceDao insuranceDao;
	@RequestMapping ("/insert")
	public String insertData()
	{
		InsuranceData obj1 = new InsuranceData();
		obj1.setId(1);
		obj1.setName("Short Term");
		obj1.setTerm(2);
		obj1.setAmount(200000);
		obj1.setType("health");
		
		InsuranceData obj2 = new InsuranceData();
		obj2.setId(2);
		obj2.setName("Long Term");
		obj2.setTerm(5);
		obj2.setAmount(1000000);
		obj2.setType("health");
		
		InsuranceData obj3 = new InsuranceData();
		obj3.setId(3);
		obj3.setName("General Accident");
		obj3.setTerm(3);
		obj3.setAmount(400000);
		obj3.setType("accident");
		
		insuranceDao.insertData(obj1);
		insuranceDao.insertData(obj2);
		insuranceDao.insertData(obj3);
		
		return "Insurance Data insertion is successful";
	}

	
	@RequestMapping("/delete/{id}")
	public String deleteDAta(@PathVariable("id") int id)
	{
		insuranceDao.deleteRecord(id);
		return "Record deletion successful";
	}
	
	@RequestMapping("/update/{id}/{term}/{amount}")
	public String updateData(@PathVariable("id") int id, @PathVariable("term") int term, @PathVariable("amount") int amount)
	{
		insuranceDao.updateRecord(id,term,amount);
		return "Record Updated";
	}
	
	@RequestMapping("/displayAll")
	public List<InsuranceData> displayData()
	{
		List<InsuranceData> insuranceList = insuranceDao.displayAll();
		return insuranceList;
	}

}
