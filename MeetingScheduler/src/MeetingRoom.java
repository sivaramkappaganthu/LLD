public class MeetingRoom {

    private int roomId;

    private MeetingRoomStatus meetingRoomStatus;

    private int capacity;

    public MeetingRoom bookAMeetingRoom(){
        return new MeetingRoom();
    }

    public boolean isAvailable(){
        return false;
    }
}
