package com.hotelbooking.services;



import java.util.Collection;

import com.hotelbooking.models.Reservation;
import com.hotelbooking.temp.CurrentReservation;



//Service Pattern for Reservation
public interface ReservationService {
	
	public Reservation getReservationForLoggedUserById(int resId);

	public Collection<Reservation> getReservationsForLoggedUser();
	
	public void saveOrUpdateReservation(CurrentReservation currentReservation);
	
	public void deleteReservation(int resId);

	public CurrentReservation reservationToCurrentReservationById(int resId);

}
