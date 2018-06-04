package com.assistanz.querymanagement.services;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assistanz.querymanagement.entities.Queries;

public interface QueryService {
	
	// method to add query by admin
	public int addQuery(HttpServletRequest request, HttpServletResponse response, Queries queriesObject) throws IOException;
	
	//method to get a;; the queries to admin page
	public void getQueryRecords(HttpServletRequest request, HttpServletResponse response)throws IOException;
}
