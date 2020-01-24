package com.example.demo.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Size(min=2,message="should have atleast two character")
	private String name;
	
	@Past
	 private Date dob;

	
	
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

	public Date getDob() {
		return dob;
	}

	public void setDob( Date dob) {
		this.dob = dob;
	}

	
	protected User()
	{
		
	}
	
	
	public User(int id, @Size(min = 2, message = "should have atleast two character") String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	
	
	
	
	 

}
