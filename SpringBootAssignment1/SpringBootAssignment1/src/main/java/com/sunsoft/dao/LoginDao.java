package com.sunsoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.model.UserLogin;
import com.sunsoft.repository.LoginRepository;

@Service
public class LoginDao {
	@Autowired
	private LoginRepository loginRepository;
	public List<UserLogin> getUsers(){
		List<UserLogin> userList = (List<UserLogin>) loginRepository.findAll();
		return userList;
	}
}
