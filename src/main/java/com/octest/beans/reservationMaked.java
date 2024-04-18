package com.octest.beans;

import java.sql.Date;

public class reservationMaked {
	
	private int idReservation;
    private String type ;
	private int prix;
	private String equipements;
	private int nombresPersonnes;
    private Date dateArrivee;
    private Date dateDepart;
   
    
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getEquipements() {
		return equipements;
	}
	public void setEquipements(String equipements) {
		this.equipements = equipements;
	}
	public int getNombresPersonnes() {
		return nombresPersonnes;
	}
	public void setNombresPersonnes(int nombresPersonnes) {
		this.nombresPersonnes = nombresPersonnes;
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
