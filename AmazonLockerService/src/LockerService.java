import java.util.List;

public class LockerService {

    private volatile static LockerService lockerService = null;

    private List<DeliveryLocation> locationList;

    private LockerService(){

    }

    public LockerService getInstance(){
        if(lockerService==null){
            synchronized (LockerService.class){
                if(lockerService == null){
                    lockerService = new LockerService();
                }
                return lockerService;
            }

        }
        return lockerService;
    }
}
