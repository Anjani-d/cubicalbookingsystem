package com.capgemini.seatbooking.repository;
 
import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.capgemini.seatbooking.entity.Location;
 
public interface LocationRepository extends JpaRepository<Location,Integer>{
	Optional<Location> findByLocationName(String locationName);
}

