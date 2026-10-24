package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationChannelTest {

    @Test
    public void testEmailChannel() {
        NotificationChannel email = new EmailChannel();
        String result = email.sendNotification("Test Notification");
        assertEquals("Email: Test Notification", result);
    }

    @Test
    public void testSmsChannel() {
        NotificationChannel sms = new SmsChannel();
        String result = sms.sendNotification("Test Notification");
        assertEquals("SMS: Test Notification", result);
    }

    @Test
    public void testPushChannel() {
        NotificationChannel push = new PushChannel();
        String result = push.sendNotification("Test Notification");
        assertEquals("Push: Test Notification", result);
    }
}