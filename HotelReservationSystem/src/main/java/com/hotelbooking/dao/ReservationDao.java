package com.hotelbooking.dao;



import java.util.Collection;

import com.hotelbooking.models.Reservation;


// DAO Pattern for Reservation
public interface ReservationDao {
	
	public Reservation getReservationForLoggedUserById(int resId);

	public Collection<Reservation> getReservationsByUserId(int userId);
	
	public void saveOrUpdateReservation(Reservation reservation);
	
	public void deleteReservation(Reservation reservation);

}
