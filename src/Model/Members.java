package Model;
/**
 *
 * @author mounikakothapalli
 */

public class Members implements IMembers{

    private int memberId;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private String password;
    private String gender;
    private int subscribe;
    private String driverId;
 
 public Members(String name, String mobile, String email, String address, String password, String gender, int subscribe,String driverId) {

        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.password = password;
        this.gender = gender;
        this.subscribe = subscribe;
        this.driverId=driverId;
    }

    public Members(int memberId, String name, String mobile, String email, String address, String password, String gender, int subscribe,String driverId) {
        this.memberId = memberId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.password = password;
        this.gender = gender;
        this.subscribe = subscribe;
        this.driverId=driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return memberId;
    }

    public void setMemberID(int memberId) {
        this.memberId = memberId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void update(String message) {
        System.out.println("Updating members " + message);
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }
    public String getDriverId() {
        return driverId;
    }

    public void setdriverId(String driverID) {
        this.driverId = driverID;
    }

}
