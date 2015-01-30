package com.bufanbaby.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Deed extends AbstractBaseModel<Long> {
	private String title;
	private String description;
	private Date createdDate;

	@OneToMany
	private List<Fortune> fortunes;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<Fortune> getFortunes() {
		return fortunes;
	}

	public void setFortunes(List<Fortune> fortunes) {
		this.fortunes = fortunes;
	}


}
