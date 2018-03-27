package com.homestay.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

import com.homestay.dao.ISearchDAO;
import com.homestay.model.Room;

public class RoomServiceTest {

	@Test
	public void getRoomDetailsTest() {
		ISearchDAO search= mock(ISearchDAO.class);
		ArrayList<Room> rooms= new ArrayList<>();
		Room R=new Room();
		R.setCityId(1);
		R.setDistance("5");
		R.setId(1);
		R.setNoBathroom(2);
		R.setNoBedroom(2);
		R.setRoomName("Romm1");
		R.setRoomUrl("abc");
		rooms.add(R);
		when(search.getRoomDetails()).thenReturn(rooms);
		ArrayList<Room> testedRooms = search.getRoomDetails();
		assertEquals(1, testedRooms.size());
	}
	
	@Test
	public void getRoomDetailsTest2() {
		ISearchDAO search= mock(ISearchDAO.class);
		ArrayList<Room> rooms= new ArrayList<>();
		
		when(search.getRoomDetails()).thenReturn(rooms);
		ArrayList<Room> testedRooms = search.getRoomDetails();
		assertEquals(0, testedRooms.size());
	}

}
