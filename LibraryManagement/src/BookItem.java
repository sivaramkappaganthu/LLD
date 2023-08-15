import java.time.LocalDate;

public class BookItem extends Book {

    private Rack rackId;
    private Person reservedBy;
    private boolean isReferenceOnly;
    private String versionNo;
    private LocalDate dueDate;
    private double price;
    private BookStatus bookStatus;

    public void issueABookItem(){

    }

    public void surrenderABookItem(){

    }


}
