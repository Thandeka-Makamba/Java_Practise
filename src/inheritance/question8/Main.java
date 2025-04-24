package inheritance.question8;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        Notification[] notifications = {email, sms};
        for (Notification note: notifications) {
            if (note instanceof EmailNotification) {
                note.send();
                ((EmailNotification) note).preview();
            } else {
                note.send();
            }
        }

    }
}
