package com.stackroute.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App4 {
	
	public static void main(String[] args) {
		ObjectMapper obj = new ObjectMapper();
		Student st;
		try {
			st=obj.readValue(new File("./data/nested.json"), Student.class);
			obj.writeValue(new File("./data/details.json"), st);
			System.out.println("Data converted Successfully");
			
		
		}catch(Exception e) {
		System.out.println(e);

}
	}
}
