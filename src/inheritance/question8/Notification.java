package inheritance.question8;

/*

Create a class called Notification with a method send() that prints "Sending notification".
Then, create two subclasses: EmailNotification and SMSNotification.
Override the send() method in each to print "Sending email notification" and "Sending SMS notification".

In your Main class:

Create an array of Notification type that contains different types of notifications (email and SMS).

Loop through the array and call send() on each.

Then, use instanceof and casting to call a specific method preview() that exists only in EmailNotification.

💡 The preview() method in EmailNotification should print: "Previewing email notification"

 */

public class Notification {
    public void send() {
        System.out.println("Sending Notification");
    }
}
