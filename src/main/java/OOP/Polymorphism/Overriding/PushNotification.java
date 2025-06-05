package OOP.Polymorphism.Overriding;

public class PushNotification extends Notification {

    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }

}
