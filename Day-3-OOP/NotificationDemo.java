import java.util.Scanner;

class Notification {
    String recipient;

    Notification(String recipient) {
        this.recipient = recipient;
    }

    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    void send() {
        System.out.println("Email sent to " + recipient);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String recipient) {
        super(recipient);
    }

    @Override
    void send() {
        System.out.println("SMS sent to " + recipient);
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        String recipient = sc.next();

        Notification notification;

        if (type.equals("E")) {
            notification = new EmailNotification(recipient);
        } else {
            notification = new SMSNotification(recipient);
        }

        notification.send();
    }
}