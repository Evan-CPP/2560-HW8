package bridge;

public class BitcoinPayment extends Payment {

    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public String processPayment(double amount) {
        String paymentMessage = "Bitcoin payment of $" + amount + " processed. ";
        String notificationMessage = channel.sendNotification("Payment received.");
        return paymentMessage + notificationMessage;
    }
}