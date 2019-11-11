package com.tutorial.service;

import java.util.List;

import com.tutorial.entity.SignupEntity;
import com.tutorial.model.LoginModel;
import com.tutorial.model.SignupModel;

public interface TutorialService {
	public void SaveUser(SignupModel user );

	public List<SignupModel> getAllUsers();
	public SignupModel validateUser(LoginModel login);
	public void deleteUser(String user);

	
}
