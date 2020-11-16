package com.sunsoft.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.model.InsuranceData;
import com.sunsoft.repository.InsuranceRepository;



@Service
public class InsuranceDao {
	
	@Autowired
	InsuranceRepository insuranceRepository;
	public void insertData(InsuranceData insuranceObj) {
		insuranceRepository.save(insuranceObj);		
	}
	
	public void deleteRecord(int id) {
		insuranceRepository.deleteById(id);	
		}
	
	public void updateRecord(int id,int term,int amount) {
		InsuranceData ins=insuranceRepository.findById(id).get();
		ins.setTerm(term);
		ins.setAmount(amount);
		System.out.println(ins.toString());
		insuranceRepository.save(ins);
	}
	
	public List<InsuranceData> displayAll(){
		List<InsuranceData> insuranceList= (List<InsuranceData>)insuranceRepository.findAll();
		return insuranceList;
	}
}
