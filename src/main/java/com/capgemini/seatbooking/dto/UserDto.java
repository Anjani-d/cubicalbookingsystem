package com.capgemini.seatbooking.dto;
 
//UserDto.java
public class UserDto {
 
	private String username;
	private String email;
	private String password;
 
	private UserProfileDto userProfileDto;
 
	// Constructors, getters, setters...
 
	public UserDto() {
	}
 
	public UserDto(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
 
	public UserDto(String username, String email, String password, UserProfileDto userProfileDto) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.userProfileDto = userProfileDto;
	}
 
// Getters and setters...
 
	public UserProfileDto getUserProfileDto() {
		return userProfileDto;
	}
 
	public void setUserProfileDto(UserProfileDto userProfileDto) {
		this.userProfileDto = userProfileDto;
	}
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
}

