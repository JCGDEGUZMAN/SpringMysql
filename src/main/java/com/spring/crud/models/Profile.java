package com.spring.crud.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	private int pid;

	private String pfname;
	private String pmname;
	private String plname;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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
