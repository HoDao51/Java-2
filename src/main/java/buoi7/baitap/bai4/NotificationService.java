package buoi7.baitap.bai4;

public class NotificationService {
    private NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public void sendNotify(String message){
        channel.send(message);
    }
}
