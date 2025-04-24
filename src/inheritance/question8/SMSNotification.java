package inheritance.question8;

public class SMSNotification extends Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
