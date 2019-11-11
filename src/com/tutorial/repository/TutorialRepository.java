package com.tutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.entity.SignupEntity;
import com.tutorial.model.SignupModel;


@Repository
@Transactional
public interface TutorialRepository extends JpaRepository<SignupEntity, String> {

	List<SignupEntity> getAllUsers();
	
}
