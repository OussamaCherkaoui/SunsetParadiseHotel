package com.octest.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.octest.beans.Reservation;
import com.octest.beans.Room;
import com.octest.beans.reservationMaked;

public class ReservationDaoImpl implements ReservationDAO{
	
	private DaoFactory daoFactory;
	
	ReservationDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

	@Override
	public boolean reserveRoomSelected(Reservation reservation){
		Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("insert into reservation values noms(chambreReservee,dateArrivee,dateDepart) VALUES(?, ?, ?,);");
            preparedStatement.setInt(1, reservation.getChambreReservee());
            preparedStatement.setDate(2, reservation.getDateArrivee());
            preparedStatement.setDate(3, reservation.getDateDepart());
            preparedStatement.executeUpdate();
            
            preparedStatement = connexion.prepareStatement("Update Room set set dispnobilite=false where idRoom ="+reservation.getChambreReservee());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return true;
	}

	@Override
	public List<reservationMaked> consultReservation() {
		List<reservationMaked> listReservation = new ArrayList<reservationMaked>();
        Connection connexion = null;
        java.sql.Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT reservation.idReservation,room.type,room.prix,room.equipements,room.nombrePersonnes,reservation.dateArrive,reservation.dateDepart FROM reservation inner join room on reservation.chambreReservee=room.idRoom");

            while (resultat.next()) {
                System.out.println(resultat.getString("type"));
            	int idReservation= resultat.getInt("idReservation");
                String type =resultat.getString("type");
            	int prix=resultat.getInt("prix");
            	String equipements=resultat.getString("equipements");
            	int nombresPersonnes=resultat.getInt("nombrePersonnes");
                Date dateArrivee=resultat.getDate("dateArrive");
                Date dateDepart=resultat.getDate("dateDepart");
                
                reservationMaked reservMaked  = new reservationMaked();
                
                reservMaked.setIdReservation(idReservation);
                reservMaked.setType(type);;
                reservMaked.setPrix(prix);
                reservMaked.setEquipements(equipements);
                reservMaked.setNombresPersonnes(nombresPersonnes);
                reservMaked.setDateArrivee(dateArrivee);
                reservMaked.setDateDepart(dateDepart);

                listReservation.add(reservMaked);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listReservation;
	}

	
}
