package com.bufanbaby.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Deeds {
	private String name;
	private String description;
	private Date createdDate;

	@ManyToOne
	private Subject subject;

	@OneToMany
	private List<Deed> deeds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Deed> getDeeds() {
		return deeds;
	}

	public void setDeeds(List<Deed> deeds) {
		this.deeds = deeds;
	}

}
