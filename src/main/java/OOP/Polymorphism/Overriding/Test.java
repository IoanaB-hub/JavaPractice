package OOP.Polymorphism.Overriding;

public class Test {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SmsNotification();
        Notification n3 = new PushNotification();

        n1.send("Your order has been shipped.");
        n2.send("Your code is 123456.");
        n3.send("You have a new message.");

    }
}
