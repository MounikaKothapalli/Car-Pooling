package Controller;


/**
 *
 * @author mounikakothapalli
 */
public interface DBConnection {
   /**
     * Main database constants for connection - for ease of access and change
     */
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "rootroot";
    
   public static final String URL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true";
    public static final String DB_NAME = "carpoolingdb";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
}
