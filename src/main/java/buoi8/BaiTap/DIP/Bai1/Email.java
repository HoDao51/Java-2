package buoi8.BaiTap.DIP.Bai1;

public class Email implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Hello");
    }
}
