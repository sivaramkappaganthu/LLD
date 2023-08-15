import java.util.List;

public class LibraryUser extends Person{

    private String userID;
    private String password;
    private AccountStatus status;
    private Card cardId;
    private List<BookLending> issuesBooks;


    public BookLending requestForaBook(){
        return null;
    }

    public BookLending renewBookItem(BookLending bookLending){
        return null;
    }

    public double checkForFine(BookItem bookItem){
        return 0.00;
    }

    public BookItem returnAbook(BookLending bookLending){
        return null;
    }

    public int getTotalBooksIssued(){
        return issuesBooks.size();
    }
}
