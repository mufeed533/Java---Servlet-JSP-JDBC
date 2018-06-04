package com.assistanz.querymanagement.entities;

public class Products {
	private int id;
	private String name;
	private String description;
	private int price;
	
	public Products(){
		
	}
	
	Products(int id, String name, String description, int price){
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	
	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}
