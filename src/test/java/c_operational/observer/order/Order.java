package c_operational.observer.order;

import c_operational.observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registerObservers = new HashSet<>();


    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registerObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registerObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: registerObservers){
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObservers();
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
