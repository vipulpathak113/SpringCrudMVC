package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.dao.TutorialDao;
import com.tutorial.entity.SignupEntity;
import com.tutorial.model.LoginModel;
import com.tutorial.model.SignupModel;

@Service("tutorialService")
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialDao tutorialDao;
	
	public void SaveUser(SignupModel user) {
		tutorialDao.SaveUser(user);
	}

	@Override
	public List<SignupModel> getAllUsers() {
		return tutorialDao.getAllUsers();
	}

	@Override
	public SignupModel validateUser(LoginModel user) {
		return tutorialDao.validateUser(user);
		
	}

	@Override
	public void deleteUser(String user) {
		tutorialDao.deleteUser(user);
		
	}

	@Override
	public SignupModel getUser(String user) {
		return tutorialDao.getUser(user);
	}
	
}
