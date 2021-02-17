package com.simple.maven.project;

import java.util.ArrayList;
import java.util.List;

public class SampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		ItemType it = new ItemType();
		it.setFirstname("sri");
		it.setLastname("karan");
		
		ItemType it2 = new ItemType();
		it2.setFirstname("sindhu");
		it2.setLastname("bairavi");
		
		List<ItemType> types1 = new ArrayList<>();
		types1.add(it);
		
		List<ItemType> types2 = new ArrayList<>();
		types2.add(it2);
		
		Item itm = new Item();
		itm.setFullname("sri karan");
		itm.setItems(types1);
		
		Item itm2 = new Item();
		itm2.setFullname("sindhubairavi"); 
		
		itm2.setItems(types2);
		
		System.out.println("it ::"+it);
		System.out.println("it2"+it2);
		System.out.println("types"+types1);
		System.out.println("types"+types2);
		System.out.println("itm"+itm);
		System.out.println("itm"+itm2);
		
		//Jackson jackson = new Jackson();
		
		//jackson.objectMapper();
		
		
		GsonClass gson = new GsonClass();
		
		gson.arrayOfObj();

	}

}
