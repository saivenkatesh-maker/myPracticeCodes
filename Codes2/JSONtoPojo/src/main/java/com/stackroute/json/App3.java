package com.stackroute.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App3 {

	public static void main(String[] args) {
		ObjectMapper obj = new ObjectMapper();
		Student s=null;
		try {
			s=obj.readValue(new File("./data/nested.json"), Student.class);
			System.out.println("Student Personal Details");
			System.out.println(s.getId());
			System.out.println(s.getFirstName());
			System.out.println(s.getLastName());
			System.out.println(s.getEmail());
			System.out.println("---------------------------------------------");
			
			Address myAddress=s.getAddress();
			System.out.println("Student Adrress deatils");
			System.out.println(myAddress.getStreet());
			System.out.println(myAddress.getCity());
			System.out.println(myAddress.getZip());
			System.out.println(myAddress.getState());
			System.out.println(myAddress.getCountry());
			
			System.out.println("------------------------------------------");
			String str[]=s.getLanguages();
			for(String st:str) {
				System.out.println(st);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
