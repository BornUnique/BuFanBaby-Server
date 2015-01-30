package com.bufanbaby.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Fortune extends AbstractBaseModel<Long> {
	private String name;
	private Date createdDate;
	private String mime;
	private String physicalPath;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getMime() {
		return mime;
	}
	public void setMime(String mime) {
		this.mime = mime;
	}
	public String getPhysicalPath() {
		return physicalPath;
	}
	public void setPhysicalPath(String physicalPath) {
		this.physicalPath = physicalPath;
	}


}
