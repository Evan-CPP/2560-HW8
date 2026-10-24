package bridge;

public class BridgeDriver {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();
        NotificationChannel push = new PushChannel();

        Payment onlineEmail = new OnlinePaymentNotification(email);
        Payment onlineSms = new OnlinePaymentNotification(sms);
        Payment onlinePush = new OnlinePaymentNotification(push);

        Payment cashEmail = new CashOnDeliveryPayment(email);
        Payment cashSms = new CashOnDeliveryPayment(sms);
        Payment cashPush = new CashOnDeliveryPayment(push);

        Payment bitcoinEmail = new BitcoinPayment(email);
        Payment bitcoinSms = new BitcoinPayment(sms);
        Payment bitcoinPush = new BitcoinPayment(push);

        System.out.println("--------- processing payments ---------");
        System.out.println(onlineEmail.processPayment(9001.00));
        System.out.println(onlineSms.processPayment(42.69));
        System.out.println(onlinePush.processPayment(10.00));
        System.out.println(cashEmail.processPayment(12.34));
        System.out.println(cashSms.processPayment(21.00));
        System.out.println(cashPush.processPayment(20.00));
        System.out.println(bitcoinEmail.processPayment(30.00));
        System.out.println(bitcoinSms.processPayment(40.00));
        System.out.println(bitcoinPush.processPayment(50.00));
    }
}