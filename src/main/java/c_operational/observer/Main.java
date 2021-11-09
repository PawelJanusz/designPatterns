package c_operational.observer;

import c_operational.observer.notification.Email;
import c_operational.observer.notification.MobileApp;
import c_operational.observer.notification.TextMessage;
import c_operational.observer.order.Order;
import c_operational.observer.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(23L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("-------------------------------");
        order.changeOrderStatus(OrderStatus.SENT);

        order.unregisterObserver(email);

        System.out.println("-------------------------------");
        order.changeOrderStatus(OrderStatus.RECEIVED);

    }
}
