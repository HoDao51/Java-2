package buoi7.baitap.bai4;

public class EmailNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("Đang gửi Email: " + message);
    }
}
