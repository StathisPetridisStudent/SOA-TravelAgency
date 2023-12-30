package com.example.demo.hello;
import java.util.*;
import javax.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
public class Traveller {
	
	@Id
	private String afm;
	
	private String name;
	private String surname;
	private String email;
	private String password;
	
	// Default constructor (required by JPA)
    public Traveller() {
    }

    // Constructor with parameters
    public Traveller(String afm, String name, String surname, String email, String password) {
        this.afm = afm;
        this.name = name;
        this.surname = surname;
        this.email = email;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
