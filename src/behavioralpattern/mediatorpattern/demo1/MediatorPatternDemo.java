package behavioralpattern.mediatorpattern.demo1;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMassage("Hi! John");
        john.sendMassage("Hello! Robert");
    }
}
