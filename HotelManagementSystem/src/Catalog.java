import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Catalog implements Search{
    Map<RoomStyle,Room> rooms;

    @Override
    public List<Room> search(RoomStyle roomStyle, LocalDate date, int duration) {
        return null;
    }
}
