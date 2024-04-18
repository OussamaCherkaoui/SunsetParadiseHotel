package com.octest.dao;

import java.sql.Date;
import java.util.List;
import com.octest.beans.Room;


public interface RoomDAO {
	List<Room> showRoomAvailable();
	List<Room> searchRoomWithDate(Date date);
	List<Room> searchRoomWithNumberPersons(int NumberPersons);
	List<Room> searchRoomWithType(String typeRoom);
}
