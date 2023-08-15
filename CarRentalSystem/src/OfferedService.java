public abstract class OfferedService {

    private int serviceId;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public abstract double getPrice() ;
}
