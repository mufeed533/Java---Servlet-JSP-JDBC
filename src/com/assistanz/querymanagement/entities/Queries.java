package com.assistanz.querymanagement.entities;

public class Queries {
	private int queryId;
	private String firstName;
	private String lastName;
	private String email;
	private String query;
	
	public Queries(){
		
	}
	
	Queries(int query_id,String firstName,String lastName,String email,String query){
		this.queryId = query_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.query = query;
	}
	
	public int getQueryId(){
		return this.queryId;
	}
	
	public void setQueryId(int queryId){
		this.queryId = queryId;
	}
	
	public String getfirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getQuery(){
		return this.query;
	}
	
	public void setQuery(String query){
		this.query = query;
	}
	
}
