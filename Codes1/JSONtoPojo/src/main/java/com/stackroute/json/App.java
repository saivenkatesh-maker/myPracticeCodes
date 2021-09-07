package com.stackroute.json;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
//Json to java pojo convertion example
	public static void main(String[] args) {
		ObjectMapper obj = new ObjectMapper();
	    Student st=null;
	    try {
			st=obj.readValue(new File("data/sample.json"),Student.class);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	    System.out.println(st.getEmail());
	    System.out.println(st);

	}
}

