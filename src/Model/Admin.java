package Model;

import java.util.ArrayList;

/**
 *
 * @author mounikakothapalli
 */
public class Admin implements IAdmin{

    private String adminID;
    private String password;
    private ArrayList<Members> members;

    public Admin()
    {
        
    }

    public Admin(String adminID, String password) {
        this.adminID = adminID;
        this.password = password;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public ArrayList<Members> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Members> members) {
        this.members = members;
    }

}
