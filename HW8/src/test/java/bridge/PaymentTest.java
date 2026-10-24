package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    public void testOnlineWithEmail() {
        NotificationChannel email = new EmailChannel();
        Payment onlinePayment = new OnlinePaymentNotification(email);
        String result = onlinePayment.processPayment(42.00);
        assertEquals("Online payment of $42.0 processed. Email: Payment received.", result);
    }

    @Test
    public void testOnlineWithSms() {
        NotificationChannel sms = new SmsChannel();
        Payment onlinePayment = new OnlinePaymentNotification(sms);
        String result = onlinePayment.processPayment(21.50);
        assertEquals("Online payment of $21.5 processed. SMS: Payment received.", result);
    }

    @Test
    public void testCashWithEmail() {
        NotificationChannel email = new EmailChannel();
        Payment cashPayment = new CashOnDeliveryPayment(email);
        String result = cashPayment.processPayment(1.00);
        assertEquals("Cash on delivery payment of $1.0 processed. Email: Payment received.", result);
    }

    @Test
    public void testCashWithSms() {
        NotificationChannel sms = new SmsChannel();
        Payment cashPayment = new CashOnDeliveryPayment(sms);
        String result = cashPayment.processPayment(1000.00);
        assertEquals("Cash on delivery payment of $1000.0 processed. SMS: Payment received.", result);
    }
}