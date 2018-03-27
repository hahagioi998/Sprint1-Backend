package com.homestay.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.homestay.connection.ConnectionUtil;
import com.homestay.model.Room;
import com.homestay.model.Search;




@Repository
@Configuration
@EnableAutoConfiguration
public class SearchDAO implements ISearchDAO{
	@Autowired
	ConnectionUtil Conn;
	
//	 public ArrayList<Room>  getRoom(Search search) {
//		 ArrayList<Room> rooms=new ArrayList<>();
//		 PreparedStatement ps=null;
//		 Connection con;
//	    try{  
//		 con= (Connection) Conn.getConnection();  
//		ps=con.prepareStatement("select * from room where maxPeople="+search.getNoofGuests()); 
//		System.out.println(ps);
//		ResultSet rs=ps.executeQuery(); 
//		while (rs.next()) {
//			int id = rs.getInt("room_id");
//			String roomName = rs.getString("roomName");
//			String distance = rs.getString("distance");
//			int bedroom = rs.getInt("bedroom");
//			int bathroom = rs.getInt("bathroom");
//			int maxPeople = rs.getInt("maxPeople");
//			int cityId = rs.getInt("cityId");
//			String roomUrl = rs.getString("roomurl");
//			Room room = new Room();
//			room.setId(id);
//			room.setDistance(distance);
//			room.setMaxpeople(maxPeople);
//			room.setNoBathroom(bathroom);
//			room.setNoBedroom(bedroom);
//			room.setRoomName(roomName);
//			room.setRoomUrl(roomUrl);
//			room.setCityId(cityId);
//			rooms.add(room);
//		    }
//		  }
//	    catch(Exception e) {
//	    	e.printStackTrace();
//	    }
//	    
//		return rooms;
//	}
//	 
	 public ArrayList<Room>  getRoomDetails() {
		 ArrayList<Room> rooms=new ArrayList<>();
		 PreparedStatement ps=null;
		 Connection con;
	    try{  
		 con= (Connection) Conn.getConnection();  
		ps=con.prepareStatement("select * from room where maxPeople= 2 and cityId=1"); 
		System.out.println(ps);
		ResultSet rs=ps.executeQuery(); 
		while (rs.next()) {
			int id = rs.getInt("room_id");
			String roomName = rs.getString("roomName");
			String distance = rs.getString("distance");
			int bedroom = rs.getInt("bedroom");
			int bathroom = rs.getInt("bathroom");
			int maxPeople = rs.getInt("maxPeople");
			int cityId = rs.getInt("cityId");
			String roomUrl = rs.getString("roomurl");
			Room room = new Room();
			room.setId(id);
			room.setDistance(distance);
			room.setMaxpeople(maxPeople);
			room.setNoBathroom(bathroom);
			room.setNoBedroom(bedroom);
			room.setRoomName(roomName);
			room.setRoomUrl(roomUrl);
			room.setCityId(cityId);
			rooms.add(room);
		    }
		  }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
		return rooms;
	}

}

