package com.example.demo.hello;
import java.util.*;
import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Reservation {
	
	@Id
	private String id;
	
	private Traveller traveller;
	private Trip trip;
	
	// Default constructor (required by JPA)
    public Reservation() {
    }

    // Constructor with parameters
    public Reservation(String id, Traveller traveller, Trip trip) {
        this.id = id;
        this.traveller = traveller;
        this.trip = trip;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Traveller getTraveller() {
		return traveller;
	}

	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}
