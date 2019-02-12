package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	long id;
	
	String message;
	public Message() {}
	public Message(long i, String string) {
		id = i;
		message = string;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
