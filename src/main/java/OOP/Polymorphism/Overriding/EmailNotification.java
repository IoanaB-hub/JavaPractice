package OOP.Polymorphism.Overriding;

public class EmailNotification extends Notification{


    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
