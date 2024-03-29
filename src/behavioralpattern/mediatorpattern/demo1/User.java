package behavioralpattern.mediatorpattern.demo1;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMassage(String message){
        ChatRoom.shwoMessage(this, message);
    }
}
