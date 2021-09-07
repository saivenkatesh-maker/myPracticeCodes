package com.stackroute.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
//java pojo to json conversion example
public class App2 {

	public static void main(String[] args) {
		ObjectMapper obj = new ObjectMapper();
//		Student std=null;
		Student std1=null;
		
		try {
			//reading from json
			
			std1=obj.readValue(new File("./data/sample.json"), Student.class);
			//convert and store java object to json
			obj.writeValue(new File("./data/output.json"),std1);
			System.out.println("Data converted Succeefully");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		}

}


