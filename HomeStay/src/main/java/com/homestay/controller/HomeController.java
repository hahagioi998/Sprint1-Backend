package com.homestay.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.homestay.model.Room;
import com.homestay.model.Search;

import com.homestay.service.ICityDetails;
import com.homestay.service.IRoomService;


@RestController
public class HomeController {
	// whenever root path is called the below method will be executed
	
	@Autowired
	IRoomService room;
	@Autowired
	ICityDetails city;
		
//	@PostMapping(value= "/search")
//	public ArrayList<Room> getRooms(@RequestBody Search search) {
//		return room.getRoom(search);
//	}
	
	
	@GetMapping(value="/city")
	public ArrayList<String> getCities() {
		return city.GetCity();
	}
	
	@PostMapping(value="/rooms")
	public ArrayList<Room> getRooms() {
		return room.getRoomDetails();
	}

}
