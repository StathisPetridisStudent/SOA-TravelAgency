package com.example.demo.hello;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class HelloService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TravellerRepository travellerRepository;
	@Autowired
	private TravelAgencyRepository travelAgencyRepository;
	@Autowired
	private TripRepository tripRepository;
	@Autowired
	private ReservationRepository reservationRepository;

	private final Scanner scanner = new Scanner(System.in);
	
	// SignUp = Add a new User
	public void signUp(User u) throws Exception {
		Optional<User> optionalUser = userRepository.findById(u.getId());
		if(!optionalUser.isPresent())
			userRepository.save(u);
	}
	
	public void login(User u) throws Exception {
        Optional<User> optionalUser = userRepository.findById(u.getId());

        if (optionalUser.isPresent() && u.getPassword().equals(optionalUser.get().getPassword())) {
            // Authentication successful, proceed with actions
            performAction(u);
        } else {
            // Authentication failed, handle accordingly
            System.out.println("Authentication failed. Please check your credentials.");
        }
    }
	
	public void performAction(User u) throws Exception {
        // Check the user's role
        
		String userRole = u.getRole();
        if ("Traveller".equals(userRole)) {
        	// Perform actions allowed for Traveller role
            addTraveller(u); 
        	// Search for a Trip
            // Make a Reservation
        } else if ("TravelAgency".equals(userRole)) {
            // Perform actions allowed for TravelAgency role
            addTravelAgency(u);    
            // Search for a Trip
            // Add a New Trip
        } else {
            System.out.println("There is no such role. Please try again, using as a role name 'Traveller' or 'TravelAgency'.");
        }
    }
	
	private void addTraveller(User u) throws Exception {
		
		Traveller tr = new Traveller();

		System.out.println("Hello" + u.getUsername() +" ! Please enter your afm: ");
		String afm = scanner.nextLine();
        tr.setAfm(afm);
        
        tr.setName(u.getUsername());
        
        System.out.println("Please enter your surname");
        String surname = scanner.nextLine();
        tr.setSurname(surname);
        
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        tr.setEmail(email);
        
        tr.setPassword(u.getPassword());
        
        Optional<Traveller> optionalTraveller = travellerRepository.findById(tr.getAfm());
		if(!optionalTraveller.isPresent())
			travellerRepository.save(tr);
	}
	
	private void addTravelAgency(User u) throws Exception {
		
		TravelAgency ag = new TravelAgency();
		
		System.out.println("Please enter your afm: ");
		String afm = scanner.nextLine();
        ag.setAfm(afm);
        
        ag.setName(u.getUsername());
        
        System.out.println("Please enter the owner");
        String owner = scanner.nextLine();
        ag.setOwner(owner);
        
        ag.setPassword(u.getPassword());
        
        Optional<TravelAgency> optionalTravelAgency = travelAgencyRepository.findById(ag.getAfm());
		if(!optionalTravelAgency.isPresent())
			travelAgencyRepository.save(ag);
	}

	
	
	
	
	
	
	
	/*
	public List<Student> getAllStudents() throws Exception {
		return studentRepository.findAll();
	}*/

}
