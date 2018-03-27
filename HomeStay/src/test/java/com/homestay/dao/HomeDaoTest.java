package com.homestay.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.homestay.connection.IConnection;

public class HomeDaoTest {
	@Autowired
	IConnection Conn;

	@Test
	public void getCityDetailsTest() {
		ArrayList<String> cities= new ArrayList<>();
		PreparedStatement ps=null;
		 Connection con;
	    try{  
		 con= (Connection) Conn.getConnection();  
		ps=con.prepareStatement("select CityName from City"); 		             
		ResultSet rs=ps.executeQuery(); 
		while (rs.next()) {
			String city = rs.getString("CityName");
			cities.add(city);
		    }
		  }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
		assertEquals(0, cities.size());
	}

}
