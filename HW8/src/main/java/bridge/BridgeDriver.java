package bridge;

public class BridgeDriver {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();

        Payment onlineEmail = new OnlinePaymentNotification(email);
        Payment onlineSms = new OnlinePaymentNotification(sms);
        Payment cashEmail = new CashOnDeliveryPayment(email);
        Payment cashSms = new CashOnDeliveryPayment(sms);

        System.out.println("--- processing payments ---------");
        System.out.println(onlineEmail.processPayment(9001.00));
        System.out.println(onlineSms.processPayment(42.69));
        System.out.println(cashEmail.processPayment(12.34));
        System.out.println(cashSms.processPayment(21.00));
    }
}