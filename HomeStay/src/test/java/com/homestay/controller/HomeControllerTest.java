package com.homestay.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

import com.homestay.model.Room;
import com.homestay.service.ICityDetails;
import com.homestay.service.IRoomService;

public class HomeControllerTest {

	@Test
	public void GetCity_Test() {
		ICityDetails city= mock(ICityDetails.class);
		ArrayList<String> cities= new ArrayList<>();
		cities.add("Charlotte");
		cities.add("San Jose");
	
		when(city.GetCity()).thenReturn(cities);
		ArrayList<String> testedCities = city.GetCity();
		assertEquals(2, testedCities.size());
	}
	
	@Test
	public void GetCity_Test2() {
		ICityDetails city= mock(ICityDetails.class);
		ArrayList<String> cities= new ArrayList<>();
		
		when(city.GetCity()).thenReturn(cities);
		ArrayList<String> testedCities = city.GetCity();
		assertEquals(0, testedCities.size());
	}
	
	@Test
	public void getRoomDetailsTest() {
		IRoomService rooms= mock(IRoomService.class);
		ArrayList<Room> roomdetails= new ArrayList<>();
		Room R=new Room();
		R.setCityId(1);
		R.setDistance("5");
		R.setId(1);
		R.setNoBathroom(2);
		R.setNoBedroom(2);
		R.setRoomName("Romm1");
		R.setRoomUrl("abc");
		roomdetails.add(R);
		when(rooms.getRoomDetails()).thenReturn(roomdetails);
		ArrayList<Room> testedRooms = rooms.getRoomDetails();
		assertEquals(1, testedRooms.size());
	}
	
	@Test
	public void getRoomDetailsTest2() {
		IRoomService rooms= mock(IRoomService.class);
		ArrayList<Room> roomdetails= new ArrayList<>();
		when(rooms.getRoomDetails()).thenReturn(roomdetails);
		ArrayList<Room> testedRooms = rooms.getRoomDetails();
		assertEquals(0, testedRooms.size());
	}



}
