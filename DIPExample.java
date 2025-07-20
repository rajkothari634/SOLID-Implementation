// ✅ DEPENDENCY INVERSION PRINCIPLE (DIP)
// High-level modules should not depend on low-level modules; both should depend on abstractions.

//// ❌ Bad Example: NotificationService directly depends on concrete EmailSender.
class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class BadNotificationService {
    private EmailSender emailSender = new EmailSender();

    public void notify(String message) {
        emailSender.sendEmail(message);
    }
}

//// ✅ Good Example: Depend on abstraction (MessageSender)

interface MessageSender {
    void send(String message);
}

class EmailSender2 implements MessageSender {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsSender implements MessageSender {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}
