package Controller;

import Model.Admin;
import Model.DriverTrip;
import Model.Members;
import Model.Notification;
import Model.RiderTrip;
import Model.Vehicle;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author mounikakothapalli
 */
public interface DDL_Interface {

   
    public abstract ArrayList<Members> selectAllMembers();
    
    public abstract ArrayList<Vehicle> selectAllVehicles();
    
     public abstract ArrayList<Vehicle> selectMyVehicles(int ID);
     
      public abstract Vehicle selectVehicle(int ID);
     
      public abstract ArrayList<DriverTrip> selectAllDriverTrips(int ID, String from,String to,Date travelDate);
      
       public abstract ArrayList<RiderTrip> selectAllRidersTrips(int ID,int TripID);

    public abstract ArrayList<Notification> selectAllNotifications();

    public abstract Members selectMemberDetails(int ID);

    public abstract Admin selectAdminPwd(String ID);

    public abstract ArrayList<String> selectGender();
    
    public abstract ArrayList<Notification> selectDistinctNotifications();

}
