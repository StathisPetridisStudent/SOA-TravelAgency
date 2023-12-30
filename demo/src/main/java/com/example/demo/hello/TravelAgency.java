package com.example.demo.hello;
import java.util.*;
import javax.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class TravelAgency {
	
	@Id
	private String afm;
	
	private String name;
	private String owner;
	private String password;
	
	// Default constructor (required by JPA)
    public TravelAgency() {
    }

    // Constructor with parameters
    public TravelAgency(String afm, String name, String owner, String password) {
        this.afm = afm;
        this.name = name;
        this.owner = owner;
        this.password = password;
    }

	public String getAfm() {
		return afm;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
