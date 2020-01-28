package com.spring.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.crud.models.Profile;
import com.spring.crud.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService {

	@Autowired
	private ProfileRepository repository;
	
	@Override
	public List<Profile> showProfiles() {
		
		List<Profile> profile = (List<Profile>) repository.findAll();
		
		return profile;
	}

	@Override
	public long createNewProfile(Profile newProfile) {
		
		Profile Profile = repository.save(newProfile);
		
		return Profile.getId();
	}

	@Override
	public Profile showProfile(long id) {
		
		Profile profile = repository.findById(id);
		
		return profile;
	}

	@Override
	public long deleteProfile(long id) {
		
		Profile profile = repository.findById(id);
		
		long profileId = profile.getId();
		
		repository.delete(profile);
		
		return profileId;
	}

	@Override
	public long updateProfile(Profile existingProfile, long id) {
		
		Profile profile = repository.findById(id);
	
		if(profile.getId() > 0) {
			
			profile.setPfname(existingProfile.getPfname());
			profile.setPmname(existingProfile.getPmname());
			profile.setPlname(existingProfile.getPlname());
			
			repository.save(profile);
		}

		return id;
	}

}
