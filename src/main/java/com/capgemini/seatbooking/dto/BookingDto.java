package com.capgemini.seatbooking.dto;
	 
	import com.capgemini.seatbooking.entity.Booking;
	import com.capgemini.seatbooking.util.BookingStatus;
	 
	import java.time.LocalDateTime;
	 
	public class BookingDto {
	 
	private Long id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private BookingStatus status;
	 
	// Constructors, getters, setters...
	public BookingDto() {}

	 
	public Long getId() {
		return id;
	}
	 
	 
	public void setId(Long id) {
		this.id = id;
	}
	 
	 
	public LocalDateTime getStartTime() {
		return startTime;
	}
	 
	 
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	 
	 
	public LocalDateTime getEndTime() {
		return endTime;
	}
	 
	 
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	 
	 
	public BookingStatus getStatus() {
		return status;
	}
	 
	 
	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	 
	 
	public static BookingDto fromEntity(Booking booking) {
	     BookingDto bookingDto = new BookingDto();
	     bookingDto.setId(booking.getBookingId());
	     bookingDto.setStartTime(booking.getStartTime());
	     bookingDto.setEndTime(booking.getEndTime());
	     bookingDto.setStatus(booking.getBookingStatus());
	     // Map other fields as needed
	 
	     return bookingDto;
	}
	 
	// Additional methods as needed...
	}
	 


