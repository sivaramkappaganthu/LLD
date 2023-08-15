import java.time.LocalDate;
import java.util.List;

public class Shipment {

    long shipmentId;

    LocalDate shipmentDate;

    LocalDate deliveryDate;

    String fromZipCode;

    String toZipCode;

    String deliveryInstructions;

    List<String> shipmentLogs; //can create seperate class for shipment logs

    public void addShipmentLog(){

    }

    public void updateDeliveryDate(){

    }
}
