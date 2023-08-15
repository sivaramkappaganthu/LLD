import java.time.LocalDate;

public abstract class Notification {

    private int notificationId;
    private String message;
    private LocalDate notificationDate;

    public abstract void sendNotification();
}
