package com.Techment.Dao;
import java.time.LocalDate;
import java.util.Map;

import com.Techment.Model.Passenger;
import com.Techment.Model.Train;

public interface TicketDao {
	
	Train findTrain(int tno);
	Map<Passenger, Double> addPassenger(Train train);
	double calcPassengerFare(Map<Passenger, Double> map);
	String generatePNR(Train train,LocalDate ld);
	void generateTicket(Train train,String Pnr,String date,Map<Passenger, Double> hashMap,Double TotalFare);
	//double calcPassengerFare(Passenger passenger,Train train );
}
