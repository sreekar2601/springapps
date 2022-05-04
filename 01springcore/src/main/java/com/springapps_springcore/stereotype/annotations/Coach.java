package com.springapps_springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("supercoach")
@Scope("prototype")
public class Coach {
	
	@Value("11")
	private int id;
	@Value("John")
	private String name;
	
	@Value("${dbUser}")
	private String dbUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbUser=" + dbUser + "]";
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

}
