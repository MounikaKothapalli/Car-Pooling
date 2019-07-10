/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author mounikakothapalli
 */
public class DriverTrip implements IDriver{
      private String amountPerHour;
    private String source;
    private String destination;
    private String time;
    private String slotsAvailable;
    private String status;
    private String stops;
    private int tripID;
    private int vehicleID;
    private int driverID;
    private Date travelDate;
    private String driverName;
     private String mobileNo;
 public DriverTrip(int tripID, int driverID, int vehicleID,String driverName,String mobileNo, String source, String destination, String time, String amountPerHour,String slotsAvailable,String status,String stops,Date travelDate) {

        this.tripID = tripID;
        this.driverID = driverID;
        this.vehicleID = vehicleID;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.amountPerHour = amountPerHour;
        this.slotsAvailable=slotsAvailable;
        this.status=status;
        this.stops=stops;
        this.travelDate=travelDate;
        this.driverName=driverName;
        this.mobileNo=mobileNo;
    }

   public DriverTrip(int driverID, int vehicleID,String driverName,String mobileNo, String source, String destination, String time, String amountPerHour,String slotsAvailable,String status,String stops,Date travelDate) {

        this.driverID = driverID;
        this.vehicleID = vehicleID;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.amountPerHour = amountPerHour;
        this.slotsAvailable=slotsAvailable;
        this.status=status;
        this.stops=stops;
        this.travelDate=travelDate;
        this.driverName=driverName;
        this.mobileNo=mobileNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }
 public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAmountPerHour() {
        return amountPerHour;
    }

    public void setAmountPerHour(String amountPerHour) {
        this.amountPerHour = amountPerHour;
    }

    public String getSlotsAvailable() {
        return slotsAvailable;
    }

    public void setSlotsAvailable(String slotsAvailable) {
        this.slotsAvailable = slotsAvailable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }   
     public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    } 
     public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    } 
    public Date getTravelDate(){
        return travelDate;
    }
     public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    } 
}
