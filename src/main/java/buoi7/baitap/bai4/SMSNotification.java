package buoi7.baitap.bai4;

public class SMSNotification implements NotificationChannel{
    public void send(String message) {
        System.out.println("Đang gửi SMS: " + message);
    }
}
