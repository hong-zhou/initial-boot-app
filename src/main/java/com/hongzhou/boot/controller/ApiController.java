package com.hongzhou.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hongzhou.boot.domain.Room;
import com.hongzhou.boot.service.RoomServices;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	private RoomServices roomServices;
	
	@Autowired
	public ApiController(RoomServices roomServices) {
		this.roomServices = roomServices;
	}
	@GetMapping("/greeting")
	public String getGreeting() {
		return "Hello from the API!";
	}
	
	@GetMapping("/rooms")
	public List<Room> getAllRooms(){
		return this.roomServices.getAllRooms();
	}
}
