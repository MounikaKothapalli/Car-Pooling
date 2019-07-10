/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author mounikakothapalli
 */
public class Vehicle implements IVehicle{
     private int memberId;
     private int vehicleId;
    private String type;
    private String make;
    private String carNum;
    private String color;
    private String performance;

    public Vehicle(int memberId, int vehicleId,String type, String make,String carNum,String color,String performance) {
        this.memberId = memberId;
        this.vehicleId=vehicleId;
        this.type = type;
        this.make = make;
        this.carNum = carNum;
        this.color = color;
        this.performance = performance;

    }
 public Vehicle(int memberId,String type, String make,String carNum,String color,String performance) {
        this.memberId = memberId;
        this.type = type;
        this.make = make;
        this.carNum = carNum;
        this.color = color;
        this.performance = performance;

    }
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int MemberId) {
        this.memberId = MemberId;
    }
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getcarNumber() {
        return carNum;
    }

    public void setCarNumber(String carNum) {
        this.carNum = carNum;
    }
     public String getCondition() {
        return performance;
    }

    public void setCondition(String condition) {
        this.performance = condition;
    }

}
