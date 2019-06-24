package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

	@Id
	private String id;
	
	private String bName;
	private String bAuth;
	private Double bCost;
	
	public Book() {
		super();
	}

	public Book(String bName, String bAuth, Double bCost) {
		super();
		this.bName = bName;
		this.bAuth = bAuth;
		this.bCost = bCost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuth() {
		return bAuth;
	}

	public void setbAuth(String bAuth) {
		this.bAuth = bAuth;
	}

	public Double getbCost() {
		return bCost;
	}

	public void setbCost(Double bCost) {
		this.bCost = bCost;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bName=" + bName + ", bAuth=" + bAuth + ", bCost=" + bCost + "]";
	}
	
	
}
