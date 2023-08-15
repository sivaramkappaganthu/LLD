import java.time.LocalDate;

public class BookLending {

    private int lendId;
    private BookItem bookItem;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private Card issuedUser;
    private boolean isLate;

    public double calculatePenalty(){
        return 0.00;
    }

    public boolean isLate(){
        return isLate;
    }

    public void lendABook(){

    }

    public BookLending fetchLendingDetails(){

        return null;
    }

}
