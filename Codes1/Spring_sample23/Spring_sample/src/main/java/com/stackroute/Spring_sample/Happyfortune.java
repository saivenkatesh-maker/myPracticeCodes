package com.stackroute.Spring_sample;
import org.springframework.stereotype.Component;

@Component
public class Happyfortune implements Fortune{
public void getFortune() {
	System.out.println("have a good fortune from happyfortune");
}
}
