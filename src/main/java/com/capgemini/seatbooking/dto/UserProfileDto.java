package com.capgemini.seatbooking.dto;

public class UserProfileDto {
	private String email;
	private String newPassword;
	public UserProfileDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfileDto(String email, String newpassword) {
		super();
		this.email = email;
		this.newPassword = newpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewpassword() {
		return newPassword;
	}
	public void setNewpassword(String newpassword) {
		this.newPassword = newpassword;
	}
	@Override
	public String toString() {
		return "UserProfileDto [email=" + email + ", newpassword=" + newPassword + "]";
	}
}