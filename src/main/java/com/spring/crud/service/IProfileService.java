package com.spring.crud.service;

import java.util.List;

import com.spring.crud.models.Profile;


public interface IProfileService {

	public List<Profile> findAll();
	public Profile createNewProfile(Profile newProfile);
}
