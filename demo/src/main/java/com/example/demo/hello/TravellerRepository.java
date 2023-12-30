package com.example.demo.hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellerRepository extends JpaRepository<Traveller, String> {

}