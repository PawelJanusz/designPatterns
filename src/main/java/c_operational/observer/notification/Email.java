package c_operational.observer.notification;

import c_operational.observer.order.Order;

public class Email implements Observer{

    public void update(Order order){
        System.out.println("E-mail - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
