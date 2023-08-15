import java.time.LocalDate;
import java.util.List;

public class Customer extends Account {
    private String licenseNumber;
    private LocalDate licenseExpiry;

    public boolean addReservation() {
        return false;
    }

    public boolean cancelReservation() {
        return false;
    }

    public List<VehicleReservation> getReservations() {
        return null;
    }

}