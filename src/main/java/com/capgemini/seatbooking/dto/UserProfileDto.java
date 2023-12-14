package com.capgemini.seatbooking.dto;
 
import java.util.List;
 
public class UserProfileDto {
	private String email;
	private String newPassword;
 
	private Long userId;
	private String username;
	private List<BookingDto> bookings;
 
	public UserProfileDto() {
		super();
	}
 
	public UserProfileDto(String email, String newPassword) {
		super();
		this.email = email;
		this.newPassword = newPassword;
	}
 
 
	public Long getUserId() {
		return userId;
	}
 
	public void setUserId(Long userId) {
		this.userId = userId;
	}
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	
	  public List<BookingDto> getBookings() { return bookings; }
	  public void setBookings(List<BookingDto> bookings) { this.bookings =
	  bookings; }

 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getNewPassword() {
		return newPassword;
	}
 
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
 
	@Override
	public String toString() {
		return "UserProfileDto [email=" + email + ", newPassword=" + newPassword + "]";
	}
 
}

