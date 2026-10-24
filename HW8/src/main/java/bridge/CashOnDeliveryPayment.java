package bridge;

public class CashOnDeliveryPayment extends Payment {

    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public String processPayment(double amount) {
        String paymentMessage = "Cash on delivery payment of $" + amount + " processed. ";
        String notificationMessage = channel.sendNotification("Payment received.");
        return paymentMessage + notificationMessage;
    }
}