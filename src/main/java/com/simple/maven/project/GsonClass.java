package com.simple.maven.project;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonClass {
	
	public void arrayOfObj(){
		
		String json = "{\"fullname\":\"buddy\",\"items\":[{\"firstname\":\"sri\",\"lastname\":\"karan\"},{\"firstname\":\"sindhu\",\"lastname\":\"bairavi\"}]}";
		
		Gson gson = new Gson();

        Item list = gson.fromJson(json, Item.class);
        
        System.out.println(list);

        System.out.println(gson.toJson(list));
		
	}
	
}
