package OOP.Polymorphism.Overriding;

public class SmsNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
