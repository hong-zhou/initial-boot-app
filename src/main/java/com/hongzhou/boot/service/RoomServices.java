package com.hongzhou.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongzhou.boot.domain.Room;
import com.hongzhou.boot.repo.RoomRepository;

@Service
public class RoomServices {

/*	private static List<Room> rooms = new ArrayList<>();
	
	static {
		for (int i = 0; i < 10; i++) {
			rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
		}
	}
	*/
	
	private RoomRepository roomRepository;
	
	@Autowired
	public RoomServices(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}
	
	public List<Room> getAllRooms(){
		//return rooms;
		List<Room> rooms = new ArrayList<>();
		this.roomRepository.findAll().forEach(rooms::add);
		return rooms;
	}
}
