import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public interface Search {

    public List<Room> search(RoomStyle roomStyle, LocalDate date, int duration);
}
