package com.spring.crud.service;

import java.util.List;
import java.util.Optional;

import com.spring.crud.models.Profile;


public interface IProfileService {

	public List<Profile> showProfiles();
	public Profile createNewProfile(Profile newProfile);
	public Profile showProfile(long id);
	public long deleteProfile(long id);
}
