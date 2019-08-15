package behavioralpattern.mediatorpattern.demo1;

import java.util.Date;

public class ChatRoom {
    public static void shwoMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
