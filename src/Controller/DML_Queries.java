package Controller;

import Model.DriverTrip;
import Model.Members;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.Notification;
import Model.RiderTrip;
import Model.Vehicle;

/**
 *
 * @author mounikakothapalli
 */
public class DML_Queries extends Database_Queries implements DML_Interface {

    protected PreparedStatement pst = null;
    protected Statement st = null;
    protected ResultSet rs = null;

    private static DML_Queries inst;

    public static DML_Queries getInst() {
        if (inst == null) {
            inst = new DML_Queries();
        }
        return inst;
    }

    @Override
    public boolean UpdateMember(Members member) {
        try {
            String query = "UPDATE carpoolingdb.Members SET "
                    + "Name= ?,"
                    + "Mobile= ?,"
                    + "Email= ?,"
                    + "Address= ?,"
                    + "Password= ?,"
                    + "Gender= ?, "
                    + "Subscribe= ?,"
                    +"DriverID=?"
                    + " WHERE MemberID = ? ";

            pst = getConnection().prepareStatement(query);
            pst.setString(1,  member.getName());
            pst.setString(2, member.getMobile());
            pst.setString(3, member.getEmail());
            pst.setString(4, member.getAddress());
            pst.setString(5,  member.getPassword());
            pst.setString(6, member.getGender());
            pst.setInt(7, member.getSubscribe());
            pst.setString(8, member.getDriverId());
            pst.setInt(9, member.getMemberID());
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Updation of Member failed");
        }
        return false;
    }
 @Override
    public boolean UpdateVehicle(Vehicle vh) {
        try {
            String query = "UPDATE carpoolingdb.Vehicle SET "
                    + "MemberID= ?,"
                    + "Type= ?,"
                    + "Make= ?,"
                    + "VehicleNo= ?,"
                    + "Color= ?, "
                    + "Performance= ?"
                    
                    + " WHERE VehicleID = ? ";

            pst = getConnection().prepareStatement(query);
            pst.setInt(1,  vh.getMemberId());
            pst.setString(2, vh.getType());
            pst.setString(3, vh.getMake());
            pst.setString(4, vh.getcarNumber());
            pst.setString(5,  vh.getColor());
            pst.setString(6, vh.getCondition());
            pst.setInt(7, vh.getVehicleId());
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Updation of Vehicle failed");
        }
        return false;
    }
    @Override
    public boolean InsertNotification(Notification notification) {
        try {
            String query = "insert into carpoolingdb.Notifications (MemberID, Message, BookingDate) values(?,?,?)";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, notification.getMemberId());
            pst.setString(2, notification.getMessage());
            pst.setDate(3, notification.getSentDate());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Insert Notification failed");
        }
        return false;
    }

   

    @Override
    public int InsertMember(Members mem) {
        int id = 0;
        try {
            String query = "insert into carpoolingdb.Members (Name,Mobile,Email,Address,Password,Gender,Subscribe,DriverID) values(?,?,?,?,?,?,?,?);";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, mem.getName());
            pst.setString(2, mem.getMobile());
            pst.setString(3, mem.getEmail());
            pst.setString(4, mem.getAddress());
            pst.setString(5, mem.getPassword());
            pst.setString(6, mem.getGender());
            pst.setInt(7, mem.getSubscribe());
            pst.setString(8, mem.getDriverId());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("got Member id" + id);
            }
            return id;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inserting Member failed");
        }
        return id;
    }
    
    
     @Override
    public int InsertVehicle(Vehicle vh) {
        int id = 0;
        try {
            String query = "insert into carpoolingdb.Vehicle (MemberID,Type,Make,VehicleNo,Color,Performance) values(?,?,?,?,?,?);";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, vh.getMemberId());
            pst.setString(2, vh.getType());
            pst.setString(3, vh.getMake());
            pst.setString(4, vh.getcarNumber());
            pst.setString(5, vh.getColor());
            pst.setString(6, vh.getCondition());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("got Vehicle id" + id);
            }
            return id;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inserting Vehicle failed");
        }
        return id;
    }
    
     @Override
    public int InsertTrip(DriverTrip trip) {
        int id = 0;
        try {
            String query = "insert into carpoolingdb.DriverTrip (MemberID,VehicleID,Source,Destination,Time,AmountPerPerson,SlotsAvailable,Status,Stops,TravelDate,DriverName,MobileNo) values(?,?,?,?,?,?,?,?,?,?,?,?);";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, trip.getDriverID());
            pst.setInt(2, trip.getVehicleID());
            pst.setString(3, trip.getSource());
            pst.setString(4, trip.getDestination());
            pst.setString(5, trip.getTime());
            pst.setString(6, trip.getAmountPerHour());
            pst.setString(7, trip.getSlotsAvailable());
            pst.setString(8, trip.getStatus());
            pst.setString(9, trip.getStops());
            pst.setDate(10, trip.getTravelDate());
             pst.setString(11, trip.getDriverName());
              pst.setString(12, trip.getMobileNo());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("got Trip id" + id);
            }
            return id;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inserting Trip failed");
        }
        return id;
    }
    
  
    @Override
    public boolean InsertBookingInfo(RiderTrip trip) {
        int id = 0;
        try {
            String query = "insert into carpoolingdb.RiderTrip (TripID,MemberID,Source,Destination,Time,AmountPerPerson,Status,TravelDate,RiderName,MobileNo,SlotsAvailable) values(?,?,?,?,?,?,?,?,?,?,?);";
            pst = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, trip.getTripID());
            pst.setInt(2, trip.getRiderID());
            pst.setString(3, trip.getSource().toUpperCase());
            pst.setString(4, trip.getDestination().toUpperCase());
            pst.setString(5, trip.getTime());
            pst.setString(6, trip.getAmountPaid());
           
            pst.setString(7, trip.getStatus());
        
            pst.setDate(8, trip.getTravelDate());
            pst.setString(9, trip.getname());
            pst.setString(10, trip.getMobileNo());
             pst.setString(11, trip.getSlotsAvailable());
            pst.execute();
            
           return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Inserting Booking Info failed");
        }
        return false;
    }
    @Override
    public boolean UpdateTrip(int tripID, int slots,String status) {
      try {
           String query=null;
          if(status.equals("Active") ){
          
          query  = "UPDATE carpoolingdb.DriverTrip SET "
                    + "SlotsAvailable= ?"
                    + " WHERE TripID = ? ";
           pst = getConnection().prepareStatement(query);
            pst.setString(1,String.valueOf(slots -1));
            pst.setInt(2, tripID);
      }
         else if(status.equals("Cancelled")){
          
          query  = "UPDATE carpoolingdb.DriverTrip SET "
                    + "SlotsAvailable= ?"
                    + " WHERE TripID = ? ";
           pst = getConnection().prepareStatement(query);
            pst.setString(1,String.valueOf(slots+1));
            pst.setInt(2, tripID);
      }
         
         
pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Updation of Vehicle failed");
        }
        return false;
    
    }
     @Override
    public boolean UpdateDriverStatus(int ID,String status) {
      try {
           String query=null;
           if(ID==0){
            query  = "UPDATE carpoolingdb.DriverTrip SET "
                    + "Status= ?"
                    + " WHERE TravelDate < CURDATE()";
             pst = getConnection().prepareStatement(query);
            pst.setString(1,status);
           
          }
           else{
          query  = "UPDATE carpoolingdb.DriverTrip SET "
                    + "Status= ?"
                    + " WHERE TripID = ? ";
          
           pst = getConnection().prepareStatement(query);
            pst.setString(1,status);
            pst.setInt(2, ID);
            
           }
         
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Updation of Status failed");
        }
        return false;
    
    }
     @Override
    public boolean UpdateRiderStatus(int ID,int memID, String status,String SlotsAvailable) {
      try {
           String query;
          if(memID==0){
            query  = "UPDATE carpoolingdb.RiderTrip SET "
                    + "Status= ?"
                    + " WHERE TripID = ?";
            pst = getConnection().prepareStatement(query);
            pst.setString(1,status);
            pst.setInt(2, ID);
          }
          else if(ID==0){
               query  = "UPDATE carpoolingdb.RiderTrip SET "
                    + "Status= ?"
                    + " WHERE TravelDate < CURDATE()";
               pst = getConnection().prepareStatement(query);
            pst.setString(1,status);
          }
          else{
              query  = "UPDATE carpoolingdb.RiderTrip SET "
                    + "Status= ?"
                    + " WHERE TripID = ?  and MemberID = ? and SlotsAvailable=?";
              pst = getConnection().prepareStatement(query);
              pst.setString(1,status);
            pst.setInt(2, ID);
            pst.setInt(3, memID);
            pst.setString(4, SlotsAvailable);
          }
          

           
            
            
     
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Updation of Rider Status failed");
        }
        return false;
    
    }
    
    @Override
    
    public boolean DeleteMember(int memberID) {
        try {
            String query = "DELETE FROM Carpoolingdb.Members WHERE MemberID=" + memberID;
            st = getConnection().createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No Such Member exist");
        }
        return false;
    }
     @Override
    
    public boolean DeleteVehicle(int vehicleID) {
        try {
            String query = "DELETE FROM Carpoolingdb.Vehicle WHERE VehicleID=" + vehicleID;
            st = getConnection().createStatement();
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No Such Vehicle exist");
        }
        return false;
    }

}
