package com.octest.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;
import com.octest.beans.Room;

public class RoomDaoImpl implements RoomDAO {

	private DaoFactory daoFactory;

	RoomDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

	@Override
	public List<Room> showRoomAvailable() {
		List<Room> Rooms = new ArrayList<Room>();
        Connection connexion = null;
        java.sql.Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM Room where disponibilite=false;");

            while (resultat.next()) {
                int id = resultat.getInt("idRoom");
                String type=resultat.getString("type");
            	int prix=resultat.getInt("prix");
            	String equipements=resultat.getString("equipements");
            	int nombresPersonnes=resultat.getInt("nombrePersonnes");
            	boolean disponibilite=resultat.getBoolean("disponibilite");

                Room room = new Room();
                
                room.setIdRoom(id);
                room.setType(type);;
                room.setPrix(prix);
                room.setEquipements(equipements);
                room.setNombresPersonnes(nombresPersonnes);
                room.setDisponibilite(disponibilite);

                Rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Rooms;
	}

	@Override
	public List<Room> searchRoomWithDate(Date date) {
		List<Room> Rooms = new ArrayList<Room>();
        Connection connexion = null;
        java.sql.Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT room.idRoom,room.type,room.prix,room.equipements,room.nombrePersonnes,room.disponibilite FROM reservation inner join room on reservation.chambreReservee=room.idRoom where "+date+"NOT BETWEEN reservation.dateArrive and reservation.dateDepart;");

            while (resultat.next()) {
                int id = resultat.getInt("idRoom");
                String type=resultat.getString("type");
            	int prix=resultat.getInt("prix");
            	String equipements=resultat.getString("equipements");
            	int nombresPersonnes=resultat.getInt("nombresPersonnes");
            	boolean disponibilite=resultat.getBoolean("disponibilite");

                Room room = new Room();
                
                room.setIdRoom(id);
                room.setType(type);
                room.setPrix(prix);
                room.setEquipements(equipements);
                room.setNombresPersonnes(nombresPersonnes);
                room.setDisponibilite(disponibilite);

                Rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Rooms;
	}

	@Override
	public List<Room> searchRoomWithNumberPersons(int NumberPersons) {
		List<Room> Rooms = new ArrayList<Room>();
        Connection connexion = null;
        java.sql.Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM Room where disponibilite=false and nombresPersonnes="+NumberPersons+";");

            while (resultat.next()) {
            	System.out.println(resultat.getString("equipements"));
                int id = resultat.getInt("idRoom");
                String type=resultat.getString("type");
            	int prix=resultat.getInt("prix");
            	String equipements=resultat.getString("equipements");
            	int nombresPersonnes=resultat.getInt("nombresPersonnes");
            	boolean disponibilite=resultat.getBoolean("disponibilite");

                Room room = new Room();
                
                room.setIdRoom(id);
                room.setType(type);;
                room.setPrix(prix);
                room.setEquipements(equipements);
                room.setNombresPersonnes(nombresPersonnes);
                room.setDisponibilite(disponibilite);

                Rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Rooms;
	}

	@Override
	public List<Room> searchRoomWithType(String typeRoom) {
		List<Room> Rooms = new ArrayList<Room>();
        Connection connexion = null;
        java.sql.Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM Room where disponibilite=false and type="+typeRoom+";");

            while (resultat.next()) {
                int id = resultat.getInt("idRoom");
                String type=resultat.getString("type");
            	int prix=resultat.getInt("prix");
            	String equipements=resultat.getString("equipements");
            	int nombresPersonnes=resultat.getInt("nombresPersonnes");
            	boolean disponibilite=resultat.getBoolean("disponibilite");

                Room room = new Room();
                
                room.setIdRoom(id);
                room.setType(type);;
                room.setPrix(prix);
                room.setEquipements(equipements);
                room.setNombresPersonnes(nombresPersonnes);
                room.setDisponibilite(disponibilite);

                Rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Rooms;
	}
	
}
