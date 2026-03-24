package buoi7.baitap.bai4;

public class App {
    public static void main(String[] args) {
        NotificationChannel sms = new SMSNotification();
        NotificationChannel email = new EmailNotification();
        NotificationService smsNotification = new NotificationService(sms);
        NotificationService emailNotification = new NotificationService(email);
        smsNotification.sendNotify("hello!");
        emailNotification.sendNotify("helle!");
    }
}
