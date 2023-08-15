public abstract class Equipment {

    private int equipmentId;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public abstract double getPrice() ;
}
