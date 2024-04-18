package com.octest.beans;

import java.sql.Date;

public class Reservation {
     private int idReservation;
     private int chambreReservee;
     private Date dateArrivee;
     private Date dateDepart;
     
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public int getChambreReservee() {
		return chambreReservee;
	}
	public void setChambreReservee(int chambreReservee) {
		this.chambreReservee = chambreReservee;
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
     
}
