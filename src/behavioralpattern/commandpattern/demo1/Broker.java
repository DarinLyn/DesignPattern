package behavioralpattern.commandpattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        orderList.stream().forEach(Order::execute);
        orderList.clear();
    }
}
