import java.time.LocalDate;
import java.util.List;

public class VehicleReservation {

    private long reservationId;
    private Person resetvedBy;
    private Person customer;
    private LocalDate issuedDate;
    private LocalDate dueDate;
    private Vehicle vehicle;
    private String pickupLocation;
    private String returnLocation;

    List<Equipment> equipmentList;
    List<OfferedService> offeredServiceList;

    public void addService(){

    }

    public void addEquipment(){

    }

}
