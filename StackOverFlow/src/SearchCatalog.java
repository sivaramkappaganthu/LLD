import java.util.HashMap;
import java.util.List;


public class SearchCatalog implements Search {
    private HashMap<String, List<Tag>> questionsUsingTags;
    private HashMap<String, List<User>> questionsUsingUsers;
    private HashMap<String, List<String>> questionsUsingWords;

    public List<Question> searchByTags(String name) {
        return null;
    }

    public List<Question> searchByUsers(String name) {
        return null;
    }

    public List<Question> searchByWords(String words) {
        return null;
    }


}