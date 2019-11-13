package com.tutorial.dao;

import java.util.List;

import com.tutorial.entity.LoginEntity;
import com.tutorial.entity.SignupEntity;
import com.tutorial.model.LoginModel;
import com.tutorial.model.SignupModel;

public interface TutorialDao {

	public void SaveUser(SignupModel user);
	
	public SignupModel validateUser(LoginModel login);
	
	public List<SignupModel> getAllUsers();
	
	public void deleteUser(String user);
	public SignupModel getUser(String user);
}
