package com.simple.maven.project;

import java.util.List;

public class Item {
	
	String fullname;
	List<ItemType> items;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public List<ItemType> getItems() {
		return items;
	}
	public void setItems(List<ItemType> items) {
		this.items = items;
	} 	
	
	

}
