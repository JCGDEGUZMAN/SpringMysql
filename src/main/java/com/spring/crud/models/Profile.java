package com.spring.crud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String pfname;
	private String pmname;
	private String plname;
	
	public long getId() {	
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getPfname() {
		return pfname;
	}
	
	public void setPfname(String pfname) {
		this.pfname = pfname;
	}
	
	public String getPmname() {
		return pmname;
	}
	
	public void setPmname(String pmname) {
		this.pmname = pmname;
	}
	
	public String getPlname() {
		return plname;
	}
	
	public void setPlname(String plname) {
		this.plname = plname;
	}
}
