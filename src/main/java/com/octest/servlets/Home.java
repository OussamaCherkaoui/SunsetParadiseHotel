package com.octest.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Room;
import com.octest.beans.reservationMaked;
import com.octest.dao.DaoFactory;
import com.octest.dao.RoomDAO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.octest.beans.Room;
import java.sql.Date;
import java.util.List;
import com.octest.beans.Room;


@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RoomDAO RoomDAO;
	private com.octest.dao.ReservationDAO ReservationDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.RoomDAO = daoFactory.getRoomDao();
        this.ReservationDAO=daoFactory.getRerservationDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Room> listRoomAvailable = new ArrayList<Room>();
		listRoomAvailable = RoomDAO.showRoomAvailable();
		request.setAttribute("listRoomAvailable", listRoomAvailable);
		
		List<reservationMaked> ListReservation = new ArrayList<reservationMaked>();
		ListReservation = ReservationDAO.consultReservation();
		request.setAttribute("ListReservation", ListReservation);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateSearch =request.getParameter("dateSearch");
		LocalDate date = LocalDate.parse(dateSearch, dateFormatter);
		List<Room> listRoomDate = new ArrayList<Room>();
		//listRoomDate= RoomDAO.searchRoomWithDate(date);
		request.setAttribute("listRoomDate", listRoomDate);
		
		
		
		
		String typeSearch =request.getParameter("typeSearch");
		List<Room> listRoomType = new ArrayList<Room>();
		listRoomType = RoomDAO.searchRoomWithType(typeSearch);
		request.setAttribute("listRoomType", listRoomType);
		
		
		String numberPerson =request.getParameter("numberPerson");
		List<Room> listRoomNombrePersons = new ArrayList<Room>();
		listRoomNombrePersons = RoomDAO.searchRoomWithType(numberPerson);
		request.setAttribute("listRoomNombrePersons", listRoomNombrePersons);
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

}
