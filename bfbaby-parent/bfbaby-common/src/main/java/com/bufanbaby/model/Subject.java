package com.bufanbaby.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Subject extends AbstractBaseModel<Long> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
