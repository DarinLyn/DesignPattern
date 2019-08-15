package behavioralpattern.mediatorpattern.demo2;

public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message, this);
    }

    public void getMessage(String massage){
        System.out.println("house owner: " + name + " get message: " + massage);
    }
}
