package com.sunsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.dao.LoginDao;
import com.sunsoft.model.UserLogin;


@RestController
public class LoginController {
	
	@Autowired
	LoginDao loginDao;
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String validateData(@RequestParam("username") String uname,@RequestParam("password") String pass){
		List<UserLogin> users = loginDao.getUsers();
		for(UserLogin user: users) {
			if(user.getUserName().contentEquals(uname) && user.getPassword().contentEquals(pass)) {
				return "Welcome "+user.getUserName();
			}
		}
		
		return "Wrong UserName or Password";
		
	}

}
