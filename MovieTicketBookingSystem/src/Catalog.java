import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    HashMap<String, List<Movie>> movieByTitle = new HashMap<>();
    HashMap<String,List<Movie>> movieByLanguage = new HashMap<>();
    HashMap<String,List<Movie>> movieByGenere = new HashMap<>();

    public void updateMovieCatolog(){

    }

    @Override
    public List<Movie> searchMovieTitle(String title) {
        return null;
    }

    @Override
    public List<Movie> searchMovieLanguage(String language) {
        return null;
    }

    @Override
    public List<Movie> searchMovieGenre(String genre) {
        return null;
    }
}
