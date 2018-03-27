package com.hongzhou.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
	@Id
	@Column(name="Room_ID")
	@GeneratedValue
	private long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Room_Number")
	private String number;
	
	@Column(name="Bed_Info")
	private String info;
	
	public Room() {}
	
	public Room(long id, String name, String number, String info) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.info = info;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
