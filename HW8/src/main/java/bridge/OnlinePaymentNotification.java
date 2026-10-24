package bridge;

public class OnlinePaymentNotification extends Payment {

    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public String processPayment(double amount) {
        String paymentMessage = "Online payment of $" + amount + " processed. ";
        String notificationMessage = channel.sendNotification("Payment received.");
        return paymentMessage + notificationMessage;
    }
}