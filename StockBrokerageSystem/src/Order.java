public abstract class Order {

    long orderId;

    boolean buyOrder;

    OrderStatus orderStatus;

    TimeEnforcementType timeEnforcementType;

    public void setStatus(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
    }

}
