public abstract class Seat {
    private int seatNo;
    private int aisleNumber;
    private boolean isAvailable;
    private double price;

    public void bookSeat(int seatNo){

    }
    public abstract void setRate();

    public abstract void getNumberOfAvailableSeats();
}
