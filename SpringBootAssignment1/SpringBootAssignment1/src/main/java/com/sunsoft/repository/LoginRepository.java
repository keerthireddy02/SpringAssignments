package com.sunsoft.repository;

import org.springframework.data.repository.CrudRepository;

import com.sunsoft.model.UserLogin;



public interface LoginRepository extends CrudRepository<UserLogin, Integer>{

}
