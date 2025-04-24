package inheritance.question8;

public class EmailNotification extends Notification{
    @Override
    public void send() {
        System.out.println("Sending email notification");
    }

    public void preview() {
        System.out.println("Previewing email notification");
    }
}
