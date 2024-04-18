package com.octest.dao;

import java.sql.Date;
import java.util.List;

import com.octest.beans.Reservation;
import com.octest.beans.reservationMaked;

public interface ReservationDAO {
	List<reservationMaked> consultReservation();
	boolean reserveRoomSelected(Reservation reservation);
}
