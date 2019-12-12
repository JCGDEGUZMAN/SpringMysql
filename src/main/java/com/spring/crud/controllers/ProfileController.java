package com.spring.crud.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.crud.models.Profile;
import com.spring.crud.service.IProfileService;

@RestController
public class ProfileController {

	@Autowired
	IProfileService profileService;
	
	@GetMapping("/profiles")
	public List<Profile> findProfiles()
	{
		List<Profile> profiles = profileService.showProfiles();
		
		return profiles;
	}
	
	@PostMapping(path="/new-profile",consumes= {"application/json"})
	public long createNewProfile(@RequestBody Profile newProfile)
	{
		long profileId = profileService.createNewProfile(newProfile);
		
		return profileId;
	}
	
	@GetMapping("/profile/{id}")
	public Profile showProfile(@PathVariable("id") long id)
	{
		Profile profile = profileService.showProfile(id);
		
		return profile;
	}
	
	@PutMapping(path="/update-profile", consumes= {"application/json"})
	public long updateProfile(@RequestBody Profile profile)
	{
		long profileId = profileService.updateProfile(profile);
		
		return profileId;
	}
	
	@DeleteMapping(path="/delete-profile/{id}")
	public long deleteProfile(@PathVariable("id") long id)
	{
		long profileId = profileService.deleteProfile(id);
				
		return profileId;
	}
}
