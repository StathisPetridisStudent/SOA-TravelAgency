package com.example.demo.hello;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Trip {
	
	@Id
	private String id;
	
	private LocalDate startDate;
    private LocalDate endDate;
    private String departureLocation;
    private String destinationLocation;
    private String tripProgram; // Assuming HTML code as a string
    private TravelAgency travelAgency;
    private int maxParticipants; // Assuming it can be null
	
    // Default constructor (required by JPA)
    public Trip() {
    }

    // Constructor with parameters
    public Trip(String id, LocalDate startDate, LocalDate endDate, String departureLocation,
                String destinationLocation, String tripProgram, TravelAgency travelAgency, Integer maxParticipants) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.tripProgram = tripProgram;
        this.travelAgency = travelAgency;
        this.maxParticipants = maxParticipants;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public String getTripProgram() {
		return tripProgram;
	}

	public void setTripProgram(String tripProgram) {
		this.tripProgram = tripProgram;
	}

	public TravelAgency getTravelAgency() {
		return travelAgency;
	}

	public void setTravelAgency(TravelAgency travelAgency) {
		this.travelAgency = travelAgency;
	}

	public int getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

}
