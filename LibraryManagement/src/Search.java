import java.util.List;

public interface Search {

    public Book searchByName();
    public Book searchByTitle();
    public List<Book> searchByAuthor();

}
