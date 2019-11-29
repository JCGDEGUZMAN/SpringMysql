package com.spring.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.crud.models.Profile;
import com.spring.crud.service.IProfileService;

@RestController
public class ProfileController {

	@Autowired
	IProfileService profileService;
	
	@RequestMapping("profile")
	public List<Profile> findProfiles()
	{
		List<Profile> profiles = profileService.findAll();
		return profiles;
	}
	
}
