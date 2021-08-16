package com.Techment.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Train {


	private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private double tickedPrice;
	public Train(int trainNo, String trainName, String source, String destination, double tickedPrice) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.tickedPrice = tickedPrice;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTickedPrice() {
		return tickedPrice;
	}
	public void setTickedPrice(double tickedPrice) {
		this.tickedPrice = tickedPrice;
	}
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", source=" + source + ", destination="
				+ destination + ", tickedPrice=" + tickedPrice + "]";
	}
	
	
}
