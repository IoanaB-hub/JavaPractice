package OOP.Polymorphism.Overloading;

public class MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    public void sendMessage(String message, String recipient) {
        System.out.println("Sending message: \"" + message + "\" to " + recipient);
    }

    public void sendMessage(String message, String recipient, boolean isUrgent) {
        if (isUrgent) {
            System.out.println("URGENT: Sending message: \"" + message + "\" to " + recipient);
        } else {
            sendMessage(message, recipient);
        }
    }
}
