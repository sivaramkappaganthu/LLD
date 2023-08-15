import java.util.List;

public class MeetingScheduler {

    public volatile static  MeetingScheduler meetingScheduler = null;

    List<MeetingRoom> meetingRooms;

    private MeetingScheduler(){

    }

    public MeetingScheduler getMeetingSchedulerInstance(){
        return new MeetingScheduler(); //Implement threadsafe singletone
    }


    public Meeting scheduleAMeeting(Interval interval, List<User> users){
        return new Meeting();
    }

    public void cancelAMeeting(Meeting meeting){

    }

    public Notification sendANotification(Meeting meeting, List<User> users){
        return new Notification();
    }
}
