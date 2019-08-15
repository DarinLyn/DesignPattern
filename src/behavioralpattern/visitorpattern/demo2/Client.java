package behavioralpattern.visitorpattern.demo2;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Element> list = ObjectStructure.getList();
        list.stream().forEach(data -> data.accept(new Visitor()));
    }
}
