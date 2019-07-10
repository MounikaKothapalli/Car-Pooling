package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mounikakothapalli
 */
public class DatabaseMethods implements DBConnection {

    private Statement smt;
    private Connection conn = null;

    protected DatabaseMethods() {
        try {
            //load mysql driver
            Class.forName(DRIVER);
            //connect to mysql database with username and password
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            smt = conn.createStatement();
            createDataBase(); // create database
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Not Found"); // show error if ar not added to project
            System.exit(0);
        } catch (SQLException ex) { // if database exist
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }

    private void createDataBase() {
        try {
            //if no database named inventor then create it
            smt.execute("CREATE DATABASE IF NOT EXISTS CARPOOLINGDB;");

            //create tables
            smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.admin (AdminID varchar(100) NOT NULL, Password varchar(100) DEFAULT NULL,PRIMARY KEY (AdminID),UNIQUE KEY Admincol_UNIQUE (Password)); ");
            smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.members ( MemberID int(11) NOT NULL AUTO_INCREMENT,Name varchar(100) NOT NULL,Mobile varchar(50) NOT NULL,Email varchar(100) NOT NULL,Address varchar(1000) NOT NULL,Password varchar(100) NOT NULL,Gender varchar(100) NOT NULL,Subscribe int(11) NOT NULL,DriverID varchar(100),PRIMARY KEY (MemberID))AUTO_INCREMENT=1000;");
            smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.gender (Name varchar(100) NOT NULL,PRIMARY KEY (Name)); ");
            smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.notifications (MemberID int(11) NOT NULL,Message varchar(10000) NOT NULL,BookingDate date NOT NULL); ");
smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.vehicle (MemberID int(11) NOT NULL,VehicleID int(11) NOT NULL AUTO_INCREMENT,Type varchar(100) NOT NULL,Make varchar(100) NOT NULL,VehicleNo varchar(100) NOT NULL,Color varchar(100) NOT NULL,Performance varchar(100) NOT NULL,PRIMARY KEY (VehicleID))AUTO_INCREMENT=1260;");
smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.DriverTrip (TripID int(11) NOT NULL AUTO_INCREMENT,MemberID int(11) NOT NULL,VehicleID int(11) NOT NULL ,DriverName varchar(100),MobileNo varchar(50),Source varchar(100) NOT NULL,Destination varchar(100) NOT NULL,Time varchar(100) NOT NULL,AmountPerPerson varchar(100) NOT NULL,SlotsAvailable varchar(100) NOT NULL,Status varchar(100) NOT NULL, Stops varchar(100), TravelDate date NOT NULL,PRIMARY KEY (TripID))AUTO_INCREMENT=1500;");
smt.execute("CREATE TABLE IF NOT EXISTS  CARPOOLINGDB.RiderTrip (TripID int(11) NOT NULL ,MemberID int(11) NOT NULL ,Source varchar(100) NOT NULL,Destination varchar(100) NOT NULL,Time varchar(100) NOT NULL,AmountPerPerson varchar(100) NOT NULL,SlotsAvailable varchar(100) NOT NULL,Status varchar(100) NOT NULL, TravelDate date NOT NULL,RiderName varchar(100),MobileNo varchar(100))");
            //Insert Admin creds
            smt.execute("INSERT INTO CARPOOLINGDB.admin (AdminID,Password)  values('admin','admin123')");
            smt.execute("INSERT INTO CARPOOLINGDB.gender VALUES ('Female'),('Male');");
           
        } catch (SQLException ex) {
          //  ex.printStackTrace();
        }
    }
}
