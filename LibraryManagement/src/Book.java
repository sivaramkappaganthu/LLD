import java.util.List;

public class Book {


    private long bookId;
    private String bookName;
    private String isbn;
    private String pages;
    private BookType bookType;
    private List<Author> author;
    private String publisherName;
    List<BookItem> availableBooks;
    List<BookItem> issuedBooks;

}
