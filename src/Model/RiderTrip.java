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
public class RiderTrip implements IRiderTrip{
    private String amountPaid;
    private String source;
    private String destination;
    private String time;
    private String status;
    private int tripID;
    private int riderID;
    private Date travelDate;
    private String name;
    private String mobileNo;
    private String slotsAvailable;
    public RiderTrip(int tripID, int riderID,String source, String destination, String time, String amountPaid,String status,Date travelDate,String name,String mobileNo,String slotsAvailable) {

        this.tripID = tripID;
        this.riderID = riderID;
       this.amountPaid=amountPaid;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.status=status;
        this.travelDate=travelDate;
        this.name=name;
        this.mobileNo=mobileNo;
        this.slotsAvailable=slotsAvailable;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getRiderID() {
        return riderID;
    }

    public void setRiderID(int riderID) {
        this.riderID = riderID;
    }
 public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }
    public String getSlotsAvailable() {
        return slotsAvailable;
    }

    public void setSlotsAvailable(String slotsAvailable) {
        this.slotsAvailable = slotsAvailable;
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

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPerHour(String amountPaid) {
        this.amountPaid= amountPaid;
    }

     public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name= name;
    }
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    } 
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
    public Date getTravelDate(){
        return travelDate;
    }
     public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    } 
}
