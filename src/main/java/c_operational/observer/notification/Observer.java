package c_operational.observer.notification;

import c_operational.observer.order.Order;

public interface Observer {

    void update(Order order);
}
