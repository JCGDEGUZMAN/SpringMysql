package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.crud.models.Profile;
import com.spring.crud.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService {

	@Autowired
	private ProfileRepository repository;
	
	@Override
	public List<Profile> findAll() {
		
		List<Profile> profile = (List<Profile>) repository.findAll();
		
		return profile;
	}

}
