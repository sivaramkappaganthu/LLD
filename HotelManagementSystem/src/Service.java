import java.time.LocalDate;

public abstract class Service {

    String name;

    LocalDate issuedDate;

    Person issuedBy;

    public abstract double setPrice();

    public void addToInvoice(Service service){

    }
}
