package behavioralpattern.visitorpattern.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectStructure {
    public static List<Element> getList(){
        List<Element> list = new ArrayList<>();
        Random ran = new Random();

        for(int i = 0; i < 10; i++){
            int a = ran.nextInt();
            if(a > 50){
                list.add(new ConcreteElement1());
            }else {
                list.add(new ConcreteElement2());
            }
        }

        return list;
    }
}
