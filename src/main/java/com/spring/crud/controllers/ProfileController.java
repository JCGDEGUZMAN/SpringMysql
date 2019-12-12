package com.spring.crud.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.crud.models.Profile;
import com.spring.crud.service.IProfileService;

@RestController
public class ProfileController {

	@Autowired
	IProfileService profileService;
	
	@RequestMapping("/profiles")
	public List<Profile> findProfiles()
	{
		List<Profile> profiles = profileService.showProfiles();
		
		return profiles;
	}
	
	@PostMapping(path="/new-profile",consumes= {"application/json"})
	public long createNewProfile(@RequestBody Profile newProfile)
	{
		Profile profile = profileService.createNewProfile(newProfile);
		
		return profile.getId();
	}
	
	@RequestMapping("/profile/{id}")
	public Profile showProfile(@PathVariable("id") long id)
	{
		Profile profile = profileService.showProfile(id);
		
		return profile;
	}
}
