package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.crud.models.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
