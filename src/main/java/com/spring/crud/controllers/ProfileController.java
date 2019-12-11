package com.spring.crud.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.crud.models.Profile;
import com.spring.crud.service.IProfileService;

@RestController
public class ProfileController {

	@Autowired
	IProfileService profileService;
	
	@RequestMapping("profiles")
	public List<Profile> findProfiles()
	{
		List<Profile> profiles = profileService.showProfiles();
		
		return profiles;
	}
	
	@RequestMapping("new-profile")
	public long createNewProfile(Profile newProfile)
	{
		Profile profile = profileService.createNewProfile(newProfile);
		
		return profile.getId();
	}
	
	@RequestMapping("profile/{id}")
	public Profile showProfile(@PathVariable("id") long id)
	{
		Profile profile = profileService.showProfile(id);
		
		return profile;
	}
}
