package buoi8.BaiTap.DIP.Bai1;

public class NotificationService {
    private final MessageSender channel;

    public NotificationService(MessageSender channel) {
        this.channel = channel;
    }

    public MessageSender getChannel() {
        return channel;
    }

    public void sendNotify(String message){
        channel.sendMessage(message);
    }
}
