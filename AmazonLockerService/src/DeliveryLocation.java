import java.time.LocalDateTime;
import java.util.HashMap;

public class DeliveryLocation {

    private long locationId;

    private Address address;

    private HashMap<LockerSize,Integer> noOfLockersAvailable;
    private long noOfLockersOccupied;

    private LocalDateTime storeOpenTime;
    private LocalDateTime storeCloseTime;

    public void isStoreOpen(LocalDateTime currentTime){

    }

}
