package com.capgemini.seatbooking.service;
 
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.capgemini.seatbooking.entity.Location;
import com.capgemini.seatbooking.repository.LocationRepository;
 
@Service
public class LocationService {
	@Autowired
	LocationRepository locationRepository;
	public Location getLocationByName(String locationName)
	{
		Optional<Location> locationOptional = locationRepository.findByLocationName(locationName);
		if(locationOptional.isPresent())
			return locationOptional.get();
		return null;
	}
}