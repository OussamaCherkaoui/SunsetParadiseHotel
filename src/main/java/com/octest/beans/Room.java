package com.octest.beans;


public class Room {
	private int idRoom ; 
	private String type ;
	private int prix;
	private String equipements;
	private int nombresPersonnes;
	private boolean disponibilite;
	
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
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
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
}
