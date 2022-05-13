package com.edubridge.hibernate.annotation;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "EmpAravindh")
public class AttributeOverrideExample {

@Id
@GeneratedValue
@Column(name="emp_id")
private int id;
@Column(name="first_name",unique=true,length=20)
private String firstName;
@Column(name="last_name",nullable=false)
public String lastName;
@Column(name="address")
@Embedded
@AttributeOverrides({
@AttributeOverride(name="city",column=@Column(name="h_city")),
@AttributeOverride(name="street",column=@Column(name="h_street")),
@AttributeOverride(name="pincode",column=@Column(name="h_pincode")),
@AttributeOverride(name="state",column=@Column(name="h_state"))})
public Address homeAddress;

@Embedded //For value type object
public Address jobAddress;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
public Address getJobAddress() {
	return jobAddress;
}
public void setJobAddress(Address jobAddress) {
	this.jobAddress = jobAddress;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}


