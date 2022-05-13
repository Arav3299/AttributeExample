package com.edubridge.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestAttribute {
	public static void main (String[] args) {
		
		Session session = UserSession.getSession();
		Transaction t=session.beginTransaction(); 
		
		AttributeOverrideExample aoe = new AttributeOverrideExample();
		
		Address homeAddress = new Address();
		
		Address jobAddress = new Address();
		
		homeAddress.setCity("palani");
		homeAddress.setPincode("624601");
		homeAddress.setStreet("adivaram");
		homeAddress.setState("TN");
		
		jobAddress.setCity("whitefield");
		jobAddress.setPincode("768");
		jobAddress.setState("KA");
		jobAddress.setStreet("Fc road");
		
		aoe.setFirstName("Arav");
		//aoe.setId(500);
		aoe.setLastName("raj");
		
		aoe.setHomeAddress(homeAddress);
		aoe.setJobAddress(jobAddress);
		
		session.save(aoe);
		
		t.commit();
		session.close();
		
		
		
		
		
		
	}

}
