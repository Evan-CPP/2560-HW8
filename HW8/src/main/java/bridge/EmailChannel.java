package bridge;

public class EmailChannel implements NotificationChannel {
    @Override
    public String sendNotification(String message) {
        return "Email: " + message;
    }
}