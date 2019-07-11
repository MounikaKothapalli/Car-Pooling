package Controller;

/**
 *
 * @author mounikakothapalli
 */
import Model.Admin;
import Model.DriverTrip;
import Model.Members;
import Model.Notification;
import Model.RiderTrip;
import Model.Vehicle;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DDL_Queries extends Database_Queries implements DDL_Interface {

    protected PreparedStatement pst = null;
    protected Statement st = null;
    protected ResultSet rs = null;

    private static DDL_Queries inst;

    public static DDL_Queries getInst() {
        if (inst == null) {
            inst = new DDL_Queries();
        }
        return inst;
    }

    @Override
    public ArrayList<Members> selectAllMembers() {
        try {
            String query = "SELECT * FROM carpoolingdb.Members ";
            ArrayList<Members> members = new ArrayList<Members>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int memberID = rs.getInt(1);
                String name = rs.getString(2);
                String mobile = rs.getString(3);
                String email = rs.getString(4);
                String address = rs.getString(5);
                String password = rs.getString(6);
                String gender = rs.getString(7);
                int subscribe = rs.getInt(8);
                String driverId=rs.getString(9);
                Members member = new Members(memberID, name, mobile, email, address, password, gender, subscribe,driverId);
                members.add(member);
            }
            return members;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
     @Override
    public ArrayList<Vehicle> selectAllVehicles() {
        try {
            String query = "SELECT * FROM carpoolingdb.Vehicle";
            ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int memberID = rs.getInt(1);
                int vehicleID = rs.getInt(2);
                String type = rs.getString(3);
                String make = rs.getString(4);
                String vehNo = rs.getString(5);
                String color = rs.getString(6);
                String condition = rs.getString(7);
                
                Vehicle vehicle = new Vehicle(memberID,vehicleID, type, make, vehNo, color, condition);
                vehicles.add(vehicle);
            }
            return vehicles;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
   @Override
    public ArrayList<Vehicle> selectMyVehicles(int ID) {
        try {
            String query = "SELECT * FROM carpoolingdb.Vehicle where MemberID="+ID;
            ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int memberID = rs.getInt(1);
                int vehicleID = rs.getInt(2);
                String type = rs.getString(3);
                String make = rs.getString(4);
                String vehNo = rs.getString(5);
                String color = rs.getString(6);
                String condition = rs.getString(7);
                
                Vehicle vehicle = new Vehicle(memberID,vehicleID, type, make, vehNo, color, condition);
                vehicles.add(vehicle);
            }
            return vehicles;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
     @Override
    public Vehicle selectVehicle(int ID) {
        try {
            String query = "SELECT * FROM carpoolingdb.Vehicle where VehicleID="+ID;
            ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int memberID = rs.getInt(1);
                int vehicleID = rs.getInt(2);
                String type = rs.getString(3);
                String make = rs.getString(4);
                String vehNo = rs.getString(5);
                String color = rs.getString(6);
                String condition = rs.getString(7);
                
                Vehicle vehicle = new Vehicle(memberID,vehicleID, type, make, vehNo, color, condition);
                return vehicle;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     @Override
    public ArrayList<DriverTrip> selectAllDriverTrips(int ID,String from, String to, Date date) {
        try {
            String query=null;
            if(ID==0){
             query= "SELECT * FROM carpoolingdb.DriverTrip dp where (Source='"+from.toUpperCase()+"' OR Destination='"+to.toUpperCase()+"' OR (dp.Stops like '%"+from.toUpperCase()+"%'  OR dp.Stops like '%"+to.toUpperCase()+"%')) and TravelDate='"+date+"' and status='Active' and SlotsAvailable<>'0'";
            }
            else if(ID==1&&"Alltrips".equals(from)){
                query= "SELECT * FROM carpoolingdb.DriverTrip";
            }
            
            else if("Rider".equals(from)){
                query= "SELECT * FROM carpoolingdb.DriverTrip where TripID="+ID;
            }
            else{
                 query= "SELECT * FROM carpoolingdb.DriverTrip where MemberID="+ID;
            }
            ArrayList<DriverTrip> trips = new ArrayList<>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int tripID=rs.getInt(1);
                int memberID = rs.getInt(2);
                int vehicleID = rs.getInt(3);
                String name=rs.getString(4);
                  String mobileNo=rs.getString(5);
                String source = rs.getString(6);
                String destination = rs.getString(7);
                String time = rs.getString(8);
                String amountPerPerson = rs.getString(9);
                String slotsAvailable = rs.getString(10);
                  String status = rs.getString(11);
                   String stops = rs.getString(12);
                   Date travelDate=rs.getDate(13);
               DriverTrip trip = new DriverTrip(tripID,memberID, vehicleID,name,mobileNo,source, destination, time, amountPerPerson, slotsAvailable,status,stops,travelDate);
                trips.add(trip);
            }
            return trips;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    @Override
    public ArrayList<RiderTrip> selectAllRidersTrips(int ID,int TripID) {
        try {
            String  query=null;
           if(ID==0){
                query= "SELECT * FROM carpoolingdb.RiderTrip where Status<>'Cancelled' and TripID="+TripID;
           }
           else{
                query= "SELECT * FROM carpoolingdb.RiderTrip where MemberID="+ID;
           }
                
            
            ArrayList<RiderTrip> trips = new ArrayList<RiderTrip>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int tripID=rs.getInt(1);
                int memberID = rs.getInt(2);
              
                String source = rs.getString(3);
                String destination = rs.getString(4);
                String time = rs.getString(5);
                String amountPerPerson = rs.getString(6);
               String slotsAvailable=rs.getString(7);
                  String status = rs.getString(8);
                  
                   Date travelDate=rs.getDate(9);
                    String name=rs.getString(10);
                  String mobileNo=rs.getString(11);
                   
               RiderTrip trip = new RiderTrip(tripID,memberID,source, destination, time, amountPerPerson,status,travelDate,name,mobileNo,slotsAvailable);
                trips.add(trip);
            }
            return trips;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    @Override
    public ArrayList<Notification> selectAllNotifications() {
        try {
            String query = "SELECT * FROM carpoolingdb.Notifications ";
            ArrayList<Notification> notifications = new ArrayList<>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int eventManagerID = rs.getInt(1);
                String message = rs.getString(2);
                Date sentDate = rs.getDate(3);

                Notification notification = new Notification(eventManagerID, message, sentDate);
                notifications.add(notification);
            }
            return notifications;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

   
    @Override
    public Members selectMemberDetails(int ID) {
        try {
            String query = "SELECT * FROM carpoolingdb.Members where MemberID= " + ID;
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            Members Member = null;
            while (rs.next()) {
                int memberID = rs.getInt(1);
                String name = rs.getString(2);
                String mobile = rs.getString(3);
                String email = rs.getString(4);
                String address = rs.getString(5);
                String password = rs.getString(6);
                String gender = rs.getString(7);
                int subscribe = rs.getInt(8);
                String driverId=rs.getString(9);
                Member = new Members(memberID, name, mobile, email, address, password, gender, subscribe,driverId);
            }
            return Member;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Admin selectAdminPwd(String ID) {

        try {
            String query = "SELECT * FROM carpoolingdb.admin where AdminID='" + ID + "'";
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            Admin admin = null;
            while (rs.next()) {
                String adminID = rs.getString(1);
                String pwd = rs.getString(2);
                admin = new Admin(adminID, pwd);
            }
            return admin;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<String> selectGender() {
        try {
            String query = "SELECT Name FROM carpoolingdb.Gender ";
            ArrayList<String> genderList = new ArrayList<>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                String gender = rs.getString(1);
                genderList.add(gender);
            }
            return genderList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     @Override
    public ArrayList<Notification> selectDistinctNotifications() {
        try {
            String query = "SELECT distinct message,BookingDate FROM carpoolingdb.notifications;";
            ArrayList<Notification> notifications = new ArrayList<>();
            st = getConnection().createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                int memberID = 0;
                String message = rs.getString(1);
                Date sentDate = rs.getDate(2);
                Notification notification = new Notification(memberID, message, sentDate);
                notifications.add(notification);
            }
            return notifications;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
