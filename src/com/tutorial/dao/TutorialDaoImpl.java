package com.tutorial.dao;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.entity.LoginEntity;
import com.tutorial.entity.SignupEntity;
import com.tutorial.model.LoginModel;
import com.tutorial.model.SignupModel;
import com.tutorial.repository.TutorialRepository;



@Component
public class TutorialDaoImpl implements TutorialDao  {
	
	@Autowired
	private TutorialRepository repo;
	
	
	ModelMapper modelMapper= new ModelMapper();
	
	@Override
	public void SaveUser(SignupModel user ) {
		repo.save(modelMapper.map(user, SignupEntity.class));
	}

	@Override
	public SignupModel validateUser(LoginModel user) {
		if(repo.findOne(user.getUsername())==null || repo.findOne(user.getPassword())==null){
			return null;
		}
		else {
			return modelMapper.map(repo.findOne(user.getUsername()),new TypeToken<SignupModel>() {}.getType());
		}
		
	}

	@Override
	public List<SignupModel> getAllUsers() {
		return modelMapper.map(repo.getAllUsers(),new TypeToken<List<SignupModel>>() {}.getType());
	}

	@Override
	public void deleteUser(String user) {
		repo.delete(user);
		
	}

	@Override
	public SignupModel getUser(String user) {
		if(repo.findOne(user)==null){
			return null;
		}
		else {
			return modelMapper.map(repo.findOne(user),new TypeToken<SignupModel>() {}.getType());
		}
		
	}
	
}
