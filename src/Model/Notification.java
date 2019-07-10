package Model;

import java.sql.Date;

/**
 *
 * @author mounikakothapalli
 */
public class Notification implements INotifications{

    private int MemberId;
    private String message;
    private Date sentDate;

    public Notification(int MemberId, String message, Date sentDate) {
        this.MemberId = MemberId;
        this.message = message;
        this.sentDate = sentDate;

    }

    public int getMemberId() {
        return MemberId;
    }

    public void setMemberId(int MemberId) {
        this.MemberId = MemberId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

}
