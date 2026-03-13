package com.SpringModel;

public class ValidationInSpring {
	private String username;
	private Long id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ValidationInSpring [username=" + username + ", id=" + id + "]";
	}
	
	
}
