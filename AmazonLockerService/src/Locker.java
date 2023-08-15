import java.time.LocalDateTime;

public class Locker {

    private int lockerId;

    private Package lockerPackage;
    private DeliveryLocation deliveryLocation;
    private boolean isLockerOccupied;
    private boolean isLockerExpired;
    public LocalDateTime packageDeliveredTime;
    public LocalDateTime packageReceivedTime;
    public LocalDateTime dueDate;


    public int issueACode() {
        return 0;
    }

    public void verifyCode() {

    }

    public boolean isLockerFree() {
        return isLockerOccupied;
    }

    public void issueAReturnIfNotOPen() {

    }

    public void addAPackage() {

    }

    public void removeAPackage() {

    }

}
