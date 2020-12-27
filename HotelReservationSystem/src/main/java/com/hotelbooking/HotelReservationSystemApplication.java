package com.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Hotel Room Booking Management System, Web project using:

Spring Framework in java, 
Spring Boot in back-end
Thymeleaf template engine for manage front-end,
Spring Security to handle authentication and authorization,
Java Persistence API (JPA) with entity manager to handle MySql connector with database.

User can sign up and get a new account and login,  book, update and delete reservation form (CRUD) features.

@author Hossam
 */

@SpringBootApplication
public class HotelReservationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReservationSystemApplication.class, args);
	}

}
