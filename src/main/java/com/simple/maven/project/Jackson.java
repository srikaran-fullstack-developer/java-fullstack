package com.simple.maven.project;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {
	
	public void objectMapper(){
		
		ObjectMapper mapper = new ObjectMapper();
		
	    String json = "[{\"firstname\":\"sri\",\"lastname\":\"karan\"},{\"firstname\":\"sindhu\",\"lastname\":\"bairavi\"}]";

	    try {

	        // 1. convert JSON array to Array objects
	        ItemType[] pp1 = mapper.readValue(json, ItemType[].class);

	        System.out.println("JSON array to Array objects...");
	        for (ItemType person : pp1) {
	            System.out.println(person);
	        }

	        // 2. convert JSON array to List of objects
	        List<ItemType> ppl2 = Arrays.asList(mapper.readValue(json, ItemType[].class));

	        System.out.println("\nJSON array to List of objects");
	        ppl2.stream().forEach(x -> System.out.println(x));

	        // 3. alternative
	        List<ItemType> pp3 = mapper.readValue(json, new TypeReference<List<ItemType>>() {});

	        System.out.println("\nAlternative...");
	        pp3.stream().forEach(x -> System.out.println(x));

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
	}
	

}
