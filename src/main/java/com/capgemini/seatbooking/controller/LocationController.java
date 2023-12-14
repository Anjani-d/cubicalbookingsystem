package com.capgemini.seatbooking.controller;
	 
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	//import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	 
	import com.capgemini.seatbooking.entity.Location;
	import com.capgemini.seatbooking.service.LocationService;
	 
	@RestController
	@RequestMapping("/api/location")
	public class LocationController {
		@Autowired
		LocationService locationService;
		@GetMapping("/view/{locationName}")
		public ResponseEntity<Location> getLocation(@PathVariable String locationName){
	         return new ResponseEntity<>(locationService.getLocationByName(locationName),HttpStatus.OK);		
		}
	}



