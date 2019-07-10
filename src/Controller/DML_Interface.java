package Controller;


import Model.DriverTrip;
import Model.Members;

import Model.Notification;
import Model.RiderTrip;
import Model.Vehicle;


/**
 *
 * @author mounikakothapalli
 */
public interface DML_Interface {
    
    public abstract boolean  UpdateMember(Members Member);

    public abstract boolean InsertNotification(Notification notification);

    public abstract int InsertMember(Members mem);
    
    public abstract int InsertVehicle(Vehicle vh);
    
    public abstract int InsertTrip(DriverTrip trip);
    
    public abstract boolean DeleteMember(int memID);
    
    public abstract boolean UpdateVehicle(Vehicle vh);
    
    public abstract boolean DeleteVehicle(int vehID);
    
    public abstract boolean InsertBookingInfo(RiderTrip trip);
    
    public abstract boolean UpdateTrip(int tripID, int slots,String status);
    
     public abstract boolean UpdateDriverStatus(int ID, String status);
     
     public abstract boolean UpdateRiderStatus(int ID,int memID, String status,String SlotsAvailable) ;

}
