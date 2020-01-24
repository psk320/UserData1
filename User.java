package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
   // @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @Column(nullable=false)
    @NotNull
    private Integer id;
    private String name;
    private String street;
    private String zip;
    private String city;
    private String state;
    private String country;
    
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", street=" + street + ", zip=" + zip + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
	protected User()
	{
		
	}
	public User(@NotNull Integer id, String name, String street, String zip, String city, String state,
			String country) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}
    
    

	

}
