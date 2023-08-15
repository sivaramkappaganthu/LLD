import java.util.List;

public interface Search {
    public List<Question> searchByTags(String name);
    public List<Question> searchByUsers(String name);
    public List<Question> searchByWords(String words);
}