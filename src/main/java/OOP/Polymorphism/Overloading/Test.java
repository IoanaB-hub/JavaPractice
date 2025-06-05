package OOP.Polymorphism.Overloading;

public class Test {
    public static void main(String[] args) {

        MessageSender messageSender = new MessageSender();
        messageSender.sendMessage("Hello");

        messageSender.sendMessage("Hello", "Julia");
        messageSender.sendMessage("Hello","Julia",true);


    }
}
